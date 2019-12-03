package com.huang.practice.base._03_genericity;

import java.util.*;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest5 {

    public static void main(String[] args) {
        List<A> list = new ArrayList<A>();
        Map<A, B> map = new HashMap<A, B>();
        C<B> c = new C<B>();
        D<String, Integer> d = new D<String, Integer>();

        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(c.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(d.getClass().getTypeParameters()));
    }
}

class A {
}

class B {
}

class C<T> {
}

class D<P, M> {
}