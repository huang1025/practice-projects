package com.huang.practice.base._03_genericity;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest7 {

    public static <T> T instance(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        return tClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenericityTest7 instance = instance(GenericityTest7.class);
        Integer instance1 = instance(int.class);
    }
}
