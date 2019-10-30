package com.jiang.practice.spring.boot.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by huang_jiangling on 2018/4/10.
 */
@Component
public class CircleDenpendenceTest {

    @Autowired
    private CircleDenpendenceA circleDenpendenceA;
    @Autowired
    private CircleDenpendenceB circleDenpendenceB;


    @PostConstruct
    public void init() {
        System.out.println(circleDenpendenceA.getName());
        System.out.println(circleDenpendenceB.getName());
    }
}