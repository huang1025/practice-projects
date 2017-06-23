package com.huang.thread._3_;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huang on 2017/6/23.
 */
public class LockInterruptiblyTest implements Runnable {

    public static final ReentrantLock lock1 = new ReentrantLock();
    public static final ReentrantLock lock2 = new ReentrantLock();

    String threadName;

    public LockInterruptiblyTest(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            if (threadName.equals("one")) {
                lock1.lockInterruptibly();
                System.out.println(threadName + " 获得第一把锁；");
                Thread.sleep(1000);
                lock2.lockInterruptibly();
                System.out.println(threadName + " 获得第二把锁；");
            } else {
                lock2.lockInterruptibly();
                System.out.println(threadName + " 获得第一把锁；");
                Thread.sleep(1000);
                lock1.lockInterruptibly();
                System.out.println(threadName + " 获得第二把锁；");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(threadName + " 抛错;");
        } finally {
            if (lock1.isHeldByCurrentThread()) {
                lock1.unlock();
            }
            if (lock2.isHeldByCurrentThread()) {
                lock2.unlock();
            }
            System.out.println(threadName + " 执行完毕；");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(new LockInterruptiblyTest("one"));
        Thread two = new Thread(new LockInterruptiblyTest("two"));
        one.start();
        two.start();
        Thread.sleep(200);
        one.interrupt();
    }
}
