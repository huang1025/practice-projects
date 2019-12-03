package com.huang.practice.base._03_genericity;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest3<A, B> implements GenericityInterface<Integer, A> {
    @Override
    public void invoke(Integer integer, A a) {
        System.out.println(integer);
        System.out.println(a);
    }

    public void invoke2(B b) {
        System.out.println(b);
    }
}
