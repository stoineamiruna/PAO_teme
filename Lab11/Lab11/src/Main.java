import models.MyCache;
import models.StoredObject;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {

        StoredObject storedObject1 = new StoredObject("storedObject1", new Timestamp(System.currentTimeMillis() + 100));
        StoredObject storedObject2 = new StoredObject("storedObject2", new Timestamp(System.currentTimeMillis() + 50));
        StoredObject storedObject3 = new StoredObject("storedObject3", new Timestamp(System.currentTimeMillis() + 8000));
        StoredObject storedObject4 = new StoredObject("storedObject4", new Timestamp(System.currentTimeMillis() + 3000));

        MyCache mycache = new MyCache();
        mycache.addStoredObject(1, storedObject1);
        System.out.println("add StoredObject: " + storedObject1);
        mycache.addStoredObject(2, storedObject2);
        System.out.println("add StoredObject: " + storedObject2);
        mycache.addStoredObject(3, storedObject3);
        System.out.println("add StoredObject: " + storedObject3);
        mycache.addStoredObject(4, storedObject4);
        System.out.println("add StoredObject: " + storedObject4);

        mycache.start();


        for (int i = 3; i <= 102; i++) {
            Timestamp expTime = new Timestamp(System.currentTimeMillis() + 40000);
            StoredObject newObj = new StoredObject("StoredObject: " + i, expTime);
            mycache.addStoredObject(i, newObj);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}