package com.huang.practice.spring.base.spring.controller;

import com.google.common.collect.ImmutableMap;
import com.huang.practice.spring.base.spring.model.Employee;
import com.huang.practice.spring.base.spring.validate.EmployeeValidator;
import com.huang.practice.spring.base.spring.validate.EmployeeValidator2;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by huang_jiangling on 2017/9/18.
 */
@RestController
@RequestMapping("valid")
public class ValidateController {

    @InitBinder
    public void initBinder(DataBinder dataBinder) {
        dataBinder.addValidators(new EmployeeValidator());
        dataBinder.addValidators(new EmployeeValidator2());
    }

    @RequestMapping("hehe")
    public String hehe(@RequestBody @Validated Employee employee) {
        return "hehe";
    }

    @RequestMapping("haha")
    public Map<String, Employee> haha(@RequestBody @Validated Employee employee, Employee employee2) {
        return ImmutableMap.of("emp1", employee, "emp2", employee2);
    }
}
