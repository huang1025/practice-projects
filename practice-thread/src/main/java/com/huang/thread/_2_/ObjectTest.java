package com.huang.thread._2_;

public class ObjectTest {

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    System.out.println("object is preparing wait...");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("object has been notify...");
                }
            }
        }).start();
        Thread.sleep(3000);
        synchronized (o) {
            o.notify();
        }
        System.out.println("main thread is finished...");
    }
}
