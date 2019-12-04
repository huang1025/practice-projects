package com.huang.practice.base._03_genericity;

import com.alibaba.fastjson.JSON;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest6 {

    public static <T> T change1(Object obj) {
        return (T) obj;
    }

    public static <T> T change2(T t) {
        return t;
    }

    public static <T> T change3(Object obj, Class<T> clazz) {
        return (T) obj;
    }


    public static void main(String[] args) {

        String s = change1(12); //该代码编译不会报错，但是运行时会报错，Integer不能强转为String；
        String hehe = change2("hehe");
        Integer change = change3(12, Integer.class);
    }
}
