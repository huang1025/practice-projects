package com.huang.practice.base.singleton;

/**
 * Created by huang on 2017/5/22.
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton s;

    public static Singleton getSingleton() {
        if (s == null) {
            synchronized (Singleton.class) {
                if (s == null) {
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}

