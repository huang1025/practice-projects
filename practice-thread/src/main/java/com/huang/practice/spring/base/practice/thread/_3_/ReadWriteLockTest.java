package com.huang.practice.spring.base.practice.thread._3_;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by huang on 2017/6/23.
 */
public class ReadWriteLockTest {

    private String value = "0";

    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

    Thread readThread = new Thread(new Runnable() {
        @Override
        public void run() {
            readLock.lock();
            try {
                Thread.sleep(1000);
                System.out.println("read complete once,read:" + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            readLock.unlock();
        }
    });

    Thread writeThread = new Thread(new Runnable() {
        @Override
        public void run() {
            writeLock.lock();
            try {
                Thread.sleep(1000);
                value = String.valueOf(Integer.parseInt(value) + 1);
                System.out.println("read complete " + value + ";");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            writeLock.unlock();
        }
    });

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockTest test = new ReadWriteLockTest();

        for (int i = 0; i < 30; i++) {//即使读取线程比较多，但是也能几乎同时运行完，相互之间并行读取；
            new Thread(test.readThread).start();
        }
        for (int i = 0; i < 10; i++) {//写锁之间相互竞争锁资源，同步执行，每个线程都需要等待一秒；
            new Thread(test.writeThread).start();
        }
    }
}
