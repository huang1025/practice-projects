package com.huang.base.dto;

import com.huang.base.dto.validate.groups.FirstGroup;
import com.huang.base.dto.validate.groups.SecondGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by huang on 2017/5/18.
 */
public class Employee {

    @NotBlank(message = "员工名称不能为空;", groups = {FirstGroup.class, SecondGroup.class})
    private String name;

    @NotBlank(message = "员工名称不能为空;", groups = {SecondGroup.class})
    private Integer age;

    @Valid
    @NotNull(message = "work对象不能为空;", groups = {FirstGroup.class})
    private Work work;

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

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
