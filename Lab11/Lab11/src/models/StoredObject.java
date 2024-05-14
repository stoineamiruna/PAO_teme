package models;

import java.sql.Timestamp;

public class StoredObject {
    private Object myInfo;
    private boolean expired;
    private Timestamp expirationTime;

    public StoredObject(Object myInfo, Timestamp expirationTime) {
        this.myInfo = myInfo;
        this.expired = false;
        this.expirationTime = expirationTime;
    }

    public Object getMyInfo() {
        return myInfo;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Timestamp getExpirationTime() {
        return expirationTime;
    }

    @Override
    public String toString() {
        return "StoredObject{" +
                "myInfo=" + myInfo +
                ", expired=" + expired +
                ", expirationTime=" + expirationTime +
                '}';
    }
}
