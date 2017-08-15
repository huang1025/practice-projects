package com.huang.thread._3_;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huang on 2017/6/23.
 */
public class LockInterruptiblyTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ReentrantLock lock = new ReentrantLock();
                try {
                    lock.lockInterruptibly();
                    Thread.sleep(4000);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();//java.lang.InterruptedException: sleep interrupted
                }
            }
        });
        thread.start();

        Thread.sleep(2000);//等待线程启动；
        thread.interrupt();
    }
}
