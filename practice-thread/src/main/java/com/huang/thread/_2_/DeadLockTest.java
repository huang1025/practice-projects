package com.huang.thread._2_;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huang_jiangling on 2017/8/16.
 */
public class DeadLockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
            }
        }).start();
        lock.lock();
    }

}
