package com.huang.base.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by huang on 2017/5/18.
 */
public class Employee {

    @NotBlank(message = "名称不能为空；")
    private String name;

    @NotNull(message = "年龄不能为空；")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
