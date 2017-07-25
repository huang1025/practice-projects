package com.huang.thread._2_;

/**
 * Created by huang_jiangling on 2017/7/22.
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("进入第一个 synchronized;");
                    synchronized (obj2) {
                        System.out.println("进入第二个 synchronized;");
                        synchronized (obj3) {
                            System.out.println("进入第三个 synchronized;");
                            synchronized (obj3) {
                                System.out.println("再次对 obj3 加锁；");
                            }
                        }
                    }
                }
            }
        }).start();
    }
}
