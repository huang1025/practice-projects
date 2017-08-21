package com.huang.thread._4_;

/**
 * Created by huang_jiangling on 2017/8/19.
 */
public class JoinSleepTest {
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();
    private static Object obj3 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 start...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread1 end...");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("thread2 get lock of obj1");
                    synchronized (obj2) {
                        System.out.println("thread2 get lock of obj2");
                        synchronized (obj3) {
                            System.out.println("thread2 get lock of obj3");
                            try {
                                System.out.println("thread2 let thread1 join in;");
                                thread1.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
