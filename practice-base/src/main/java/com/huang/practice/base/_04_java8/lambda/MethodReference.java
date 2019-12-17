package com.huang.practice.base._04_java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Method -
 *
 * @author: huang_jiangling
 * @date: 2019/12/17
 **/
public class MethodReference {
    public String getName() {
        return "huang";
    }

    public String sayHello(String name) {
        return "hello " + name;
    }

    public static void main(String[] args) {
        test1(MethodReference::getName);//huang
        test2(MethodReference::sayHello);//hello hahaha
    }

    public static void test1(Function<MethodReference,String> func){
        MethodReference methodReference = new MethodReference();
        String apply = func.apply(methodReference);
        System.out.println(apply);
    }

    public static void test2(BiFunction<MethodReference,String,String> func){
        MethodReference methodReference = new MethodReference();
        String apply = func.apply(methodReference,"hahaha");
        System.out.println(apply);
    }
}
