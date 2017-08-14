package com.huang.thread._2_;

public class SynchronizedNestTest {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        synchronized (obj1) {
            synchronized (obj2) {
                synchronized (obj3) {
                    System.out.println("hehe");
                }
            }
        }
    }
}
