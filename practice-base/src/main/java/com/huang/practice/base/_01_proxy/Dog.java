package com.huang.practice.base._01_proxy;

/**
 * Dog -
 *
 * @author: huang_jiangling
 * @date: 2019/12/2
 **/
public class Dog implements Sayer {
    @Override
    public void say() {
        System.out.println("汪汪汪。。。");
    }
}
