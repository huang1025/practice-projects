package com.huang.practice.spring.base.practice.thread._5_;

/**
 * MethodParamTest -
 *
 * @author: huang_jiangling
 * @date: 2019/11/11
 **/
public class MethodParamTest {

    private String name;

    public void print(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodParamTest test = new MethodParamTest();
        // 在给方法传参的时候，同时给对应参数赋值，在FurureTask中的awaitDone方法中有此种使用方式；
        test.print(test.name = "huang");
        System.out.println("name:" + test.name);
    }
}
