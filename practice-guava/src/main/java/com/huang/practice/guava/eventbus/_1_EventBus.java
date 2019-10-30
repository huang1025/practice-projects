package com.huang.practice.spring.base.guava.eventbus;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * Created by huang_jiangling on 2018/1/30.
 */
public class _1_EventBus {
    public static void main(String[] args) {
        postFour();
    }

    private static void postOne() {
        EventBus eventBus = new EventBus();
        eventBus.register(new Object() {
            @Subscribe
            public void hehe(String name) {
                System.out.println(name);
            }

            @Subscribe
            public void haha(Object object) {
                System.out.println(object);
            }
        });
        eventBus.post("huang");//输出两遍huang；
        eventBus.post(17);//输出一遍17；
    }

    private static void postTwo() {
        EventBus eventBus = new EventBus();
        eventBus.register(new Object() {
            @Subscribe
            @AllowConcurrentEvents
            public void hehe(Integer num) throws InterruptedException {
                System.out.println(num + ":" + System.currentTimeMillis());
                Thread.currentThread().sleep(100);
            }
        });
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    eventBus.post(finalI);
                }
            }).start();
        }
    }

    private static void postThree() {
        EventBus eventBus = new EventBus();
        eventBus.register(new Object() {
            @Subscribe
            @AllowConcurrentEvents
            public void hehe(Integer num) throws InterruptedException {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "-" + num + "-" + System.currentTimeMillis());
            }
        });
        for (int i = 0; i < 9; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    eventBus.post(finalI);
                }
            }).start();
        }
    }

    private static void postFour() {
        EventBus eventBus = new EventBus();
        eventBus.register(new Object() {
            @Subscribe
            @AllowConcurrentEvents
            public void hehe(Integer num) throws InterruptedException {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "-" + num + "-" + System.currentTimeMillis());
            }
        });
        for (int i = 0; i < 9; i++) {
            eventBus.post(i);
            System.out.println("---------------");
        }
    }
}