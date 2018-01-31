package com.huang.guava.eventbus;

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
            public void hehe(String name) {
                System.out.println("hehe:" + name);
            }

            @Subscribe
            public void haha(String name) {
                System.out.println("haha:" + name);
            }

            @Subscribe
            private String xixi(String name) {
                System.out.println("xixi:" + name);
                return name;
            }
        });
        eventBus.post("huang");
    }
}
