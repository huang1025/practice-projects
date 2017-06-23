package com.huang.thread._3_;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by huang on 2017/6/23.
 */
public class ReadWriteLockTest {

    private String value = "0";

    private String read(Lock lock) {
        try {
            lock.lock();
            Thread.sleep(1000);
            return value;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return value;
    }

    private void write(Lock lock) {
        try {
            lock.lock();
            Thread.sleep(1000);
            value = String.valueOf(Integer.parseInt(value) + 1);
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

        ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();
        Runnable readRun = new Runnable() {
            @Override
            public void run() {
                readWriteLockTest.read(readLock);
            }
        };
        Runnable writeRun = new Runnable() {
            @Override
            public void run() {
                readWriteLockTest.write(writeLock);
            }
        };

        for (int i = 0; i < 30; i++) {
            new Thread(readRun).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(writeRun).start();
        }
    }
}
