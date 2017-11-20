package com.huang.mybatis.dto;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by huang_jiangling on 2017/11/9.
 */
@Getter
@Setter
public class Employee {

    public Employee() {
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private Integer id;
    private String name;
    private Integer age;
    private Sex sex;
    private Department department;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
