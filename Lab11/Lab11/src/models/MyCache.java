package models;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread {
    private Map<Integer, StoredObject> cache = new ConcurrentHashMap<>();
    private int cnt = 0;

    public void addStoredObject(int key, StoredObject storedObject) {
        cache.put(key, storedObject);
    }

    @Override
    public void run() {
        try {
            do{
                for (Map.Entry<Integer, StoredObject> entry : cache.entrySet()) {
                    if(cnt == cache.size())
                        break;
                    StoredObject storedObject = entry.getValue();
                    if(!storedObject.isExpired()){
                        Timestamp crt = new Timestamp(System.currentTimeMillis());
                        Timestamp expirationTime = storedObject.getExpirationTime();
                        if (expirationTime != null && crt.after(expirationTime)) {
                            cnt++;
                            storedObject.setExpired(true);
                            System.out.println("Expired object removed: " + entry.getKey());
                        }
                    }
                }
            }
            while(cnt != cache.size());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}

