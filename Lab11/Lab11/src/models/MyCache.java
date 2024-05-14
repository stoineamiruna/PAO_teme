package models;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread {
    private Map<Integer, StoredObject> cache = new ConcurrentHashMap<>();

    public void addStoredObject(int key, StoredObject storedObject) {
        cache.put(key, storedObject);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Timestamp crt = new Timestamp(System.currentTimeMillis());
            System.out.println("Cache size before expiration: " + cache.size());
            for (Map.Entry<Integer, StoredObject> entry : cache.entrySet()) {
                StoredObject storedObject = entry.getValue();
                Timestamp expirationTime = storedObject.getExpirationTime();
                if (expirationTime != null && crt.after(expirationTime)) {
                    storedObject.setExpired(true);
                    System.out.println("Expired object removed: " + entry.getKey());
                }
            }
            System.out.println("Cache size after expiration: " + cache.size());
        }
    }


}

