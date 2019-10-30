package com.huang.practice.spring.base.practice.thread._3_;

import org.junit.Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huang on 2017/6/23.
 */
public class ConditionTest implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();


    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("prepare to await...");
            condition.await();
            System.out.println("keep going...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ConditionTest()).start();
        Thread.sleep(2000);
        lock.lock();
        condition.signal();
        lock.unlock();
    }

    //Condition的标准使用方式；
    @Test
    public void test1() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    condition.signal();
                } catch (IllegalMonitorStateException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();
    }

    //直接等待；
    @Test
    public void test2() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        condition.await();//java.lang.IllegalMonitorStateException
    }

    //直接唤醒；
    @Test
    public void test3() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        condition.await();//java.lang.IllegalMonitorStateException
    }
}
