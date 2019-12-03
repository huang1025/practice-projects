package com.huang.practice.base._03_genericity;

/**
 * GenericityTest -
 *
 * @author: huang_jiangling
 * @date: 2019/12/3
 **/
public class GenericityTest4<A> {

    public GenericityInterface<Integer, A> method() {
        return new GenericityTest3<A, A>();
    }

    public static void main(String[] args) {
        GenericityTest4<String> test = new GenericityTest4<>();
        GenericityInterface<Integer, String> method = test.method();
        method.invoke(12, "hehe");
        GenericityTest3<String, String> g = (GenericityTest3<String, String>) method;
        g.invoke2("haha");
    }
}
