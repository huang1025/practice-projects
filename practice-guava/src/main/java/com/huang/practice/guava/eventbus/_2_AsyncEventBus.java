package com.huang.practice.spring.base.guava.eventbus;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.concurrent.Executors;

/**
 * Created by huang_jiangling on 2018/2/2.
 */
public class _2_AsyncEventBus {
    public static void main(String[] args) {
        EventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(3));
        eventBus.register(new Object() {
            @Subscribe
            @AllowConcurrentEvents
            public void hehe(Integer num) throws InterruptedException {
                Thread.currentThread().sleep(100);
                System.out.println(Thread.currentThread().getName() + "-" + num + "-" + System.currentTimeMillis());
            }
        });
        for (int i = 0; i < 9; i++) {
            eventBus.post(i);
        }
    }
}
