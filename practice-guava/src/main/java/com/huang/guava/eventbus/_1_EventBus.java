package com.huang.guava.eventbus;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * Created by huang_jiangling on 2018/1/30.
 */
public class _1_EventBus {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Object() {
            @Subscribe
            @AllowConcurrentEvents
            public void hehe(String name) throws InterruptedException {
                System.out.println("begin-" + name);
                Thread.currentThread().sleep(2000);
                System.out.println("end-" + name);
            }
        });

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    eventBus.post(Integer.toString(finalI));
                }
            }).start();
            System.out.println("------");
        }
    }
}
