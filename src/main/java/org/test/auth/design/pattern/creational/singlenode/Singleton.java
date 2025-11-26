package org.test.auth.design.pattern.creational.singlenode;

public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static synchronized  Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstancestatic() {
        return SingletonHolder.INSTANCE;
    }
}
