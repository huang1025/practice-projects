package com.huang.base.singleton;

import org.junit.Test;

/**
 * Created by huang on 2017/5/22.
 */
public class SingletonTest {

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            Singleton s = Singleton.getSingleton();
            System.out.println(s);
        }
    }
}
