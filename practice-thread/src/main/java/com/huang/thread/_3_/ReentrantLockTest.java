package com.huang.thread._3_;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huang_jiangling on 2017/7/23.
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.lock();
        reentrantLock.lock();
        reentrantLock.unlock();
        reentrantLock.unlock();
        reentrantLock.unlock();
        reentrantLock.unlock();
    }
}
