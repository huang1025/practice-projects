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
                while (true) {
                    System.out.println("running...");
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("interrupt...");
                        break;
                    }
                }
            }
        });
        thread.start();
        thread.interrupt();
        thread.join();
    }
}
