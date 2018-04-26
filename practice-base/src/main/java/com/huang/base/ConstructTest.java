package com.huang.base;

/**
 * Created by huang_jiangling on 2018/4/26.
 */
public class ConstructTest extends Father {

    private String name;

    public ConstructTest() {
        super();
        this.name = "huang";
    }

    public ConstructTest(String name) {
        this();
        this.name = this.name + name;
    }

    public static void main(String[] args) {
        new ConstructTest("_jiangling");
    }
}

class Father {

    public Father() {
        System.out.println("construct->father;");
    }
}