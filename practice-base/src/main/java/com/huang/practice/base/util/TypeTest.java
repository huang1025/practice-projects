package com.huang.practice.base.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by huang_jiangling on 2017/12/12.
 */
public class TypeTest {

    public static void main(String[] args) {
        WorkService<List<String>> workService = new WorkService<List<String>>() {
        };
        Type genericSuperclass = workService.getClass().getGenericInterfaces()[0];
        System.out.println(genericSuperclass.getTypeName());

        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        for (Type each : actualTypeArguments) {
            System.out.println("========");
            System.out.println(each.getTypeName());
        }
    }


}

interface WorkService<T> {

}