package designPattern.creational.objectPool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private int expriedTime = 30000;
    private int maxQuantity;

    private Hashtable<T, Long> locked, unlocked;
    //


    public ObjectPool() {
        this.expriedTime = 3000;
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }

    //
    public abstract T create();

    public abstract boolean validate(T o);

    public abstract void expried(T o);

    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if (now - unlocked.get(t) > expriedTime) {
                    //object has been expired
                    unlocked.remove(t);
                    expried(t);
                    t = null;
                } else {
                    if(validate(t)){
                        unlocked.remove(t);
                        locked.put(t,now);
                        return t;
                    } else {
                        unlocked.remove(t);
                        expried(t);
                        t= null;
                    }
                }
            }
        }
        // no objects available, create a new one
        t = create();
        locked.put(t, now);
        return t;
        //
    }
    //
    public synchronized void checkIn(T t){
        locked.remove(t);
        unlocked.put(t,System.currentTimeMillis());
    }
}
