package com.huang.practice.spring.base.practice.thread._3_;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huang_jiangling on 2017/8/15.
 */
public class LockNestTest {

    @Test
    public void test() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.lock();
        lock.lock();
        lock.unlock();
        lock.unlock();
        lock.unlock();
    }

    @Test
    public void test1() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.lock();
        lock.lock();
        lock.lock();//锁释放不掉，一直卡着；
        lock.unlock();
        lock.unlock();
        lock.unlock();
    }

    @Test
    public void test2() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.lock();
        lock.lock();
        lock.unlock();
        lock.unlock();
        lock.unlock();
        lock.unlock();//java.lang.IllegalMonitorStateException
    }
}
