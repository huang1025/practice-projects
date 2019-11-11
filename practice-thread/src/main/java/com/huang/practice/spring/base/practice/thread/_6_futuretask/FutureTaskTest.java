package com.huang.practice.spring.base.practice.thread._6_futuretask;

import java.util.concurrent.*;

/**
 * FutureTask - task
 *
 * @author: huang_jiangling
 * @date: 2019/11/11
 **/
public class FutureTaskTest {
    FutureTask<String> task = new FutureTask(new Callable() {
        @Override
        public Object call() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hehe";
        }
    });

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        FutureTaskTest futureTaskTest = new FutureTaskTest();
        new Thread(futureTaskTest.task).start();

        //当超过给定时间还没拿到结果，将抛出TimeoutException异常；
//        String result = futureTaskTest.task.get(5, TimeUnit.SECONDS);
        String result = futureTaskTest.task.get(12, TimeUnit.SECONDS);
        System.out.println(result);
    }
}
