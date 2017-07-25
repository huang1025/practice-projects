package com.huang.thread._3_;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huang_jiangling on 2017/7/23.
 */
public class ConditionTest2 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        condition.await();
    }
}
