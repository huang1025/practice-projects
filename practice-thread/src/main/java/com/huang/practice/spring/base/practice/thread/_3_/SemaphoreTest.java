package com.huang.practice.spring.base.practice.thread._3_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by huang on 2017/6/23.
 */
public class SemaphoreTest implements Runnable {
    private static final Semaphore semaphore = new Semaphore(5);
    @Override
    public void run() {
        try {
            semaphore.acquire();//获取许可；
            Thread.sleep(1000);
            System.out.println(semaphore.getQueueLength());//等待获取许可的线程数量；将呈现五个五个的减少；
            semaphore.release();//释放许可；
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        SemaphoreTest semaphoreTest = new SemaphoreTest();
        for (int i = 0; i < 20; i++) {
            executorService.submit(semaphoreTest);
        }
    }
}
