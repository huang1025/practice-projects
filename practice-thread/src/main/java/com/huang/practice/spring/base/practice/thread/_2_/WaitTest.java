package com.huang.practice.spring.base.practice.thread._2_;

import org.junit.Test;

/**
 * Created by huang on 2017/6/22.
 */
public class WaitTest {

    /**
     * wait调用后会释放所有持有的锁；
     */
    @Test
    public void waitTest() throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1) {
                    synchronized (obj2) {
                        synchronized (obj3) {
                            try {
                                obj1.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("sub-thread-synchronized-3");
                        }
                        System.out.println("sub-thread-synchronized-2");
                    }
                    System.out.println("sub-thread-synchronized-1");
                }
            }
        });
        thread.start();

        Thread.currentThread().sleep(2000);
        synchronized (obj1) {
            System.out.println("main-thread-synchronized-1");//只能打印这一行；
            synchronized (obj2) {
                System.out.println("main-thread-synchronized-2");
                synchronized (obj3) {
                    System.out.println("main-thread-synchronized-3");
                    obj1.notify();
                    System.out.println("haha");
                }
            }
        }
        thread.join();
    }
}
