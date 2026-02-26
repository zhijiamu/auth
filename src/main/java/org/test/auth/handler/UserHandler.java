package org.test.auth.handler;

public class UserHandler {
    private static final ThreadLocal t = new ThreadLocal<>();

    public static void set(Long uid) {
        t.set(uid);
    }

    public static Long get() {
        return (Long) t.get();
    }

    public static void remove() {
        t.remove();
    }
}
