package com.huang.thread._2_;

import org.junit.Test;

/**
 * Created by huang on 2017/6/22.
 */
public class InterruptTest {

    @Test
    public void interruptTest() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("sub thread start sleep...");
                    Thread.sleep(2000000);
                    System.out.println("sub thread end sleep...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        Thread.currentThread().sleep(2000);//等待thread启动；

        thread.interrupt();//此代码将导致sleep方法报错；

        thread.join();
    }

@Test
public void interruptTest2() throws InterruptedException {
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            Thread.currentThread().interrupt();
            try {
                Thread.currentThread().sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    thread.start();
    thread.join();
}
}
