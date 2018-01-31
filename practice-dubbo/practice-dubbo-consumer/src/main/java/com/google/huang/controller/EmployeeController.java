package com.google.huang.controller;

import com.google.huang.domain.Employee;
import com.google.huang.service.EmployeeService;
import com.google.huang.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;


/**
 * Created by Administrator on 2016/7/23 0023.
 */

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    ProviderService providerService;

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        Employee employee = new Employee();
        employee.setName("huang");
        employee.setIsValid(true);
        employee.setCreateTime(new Timestamp(System.currentTimeMillis()));

        employeeService.svae(employee);

        return "congratulation!!!";
    }

    @RequestMapping("/getNameTest")
    @ResponseBody
    public String test() {
        System.out.println("customer调用了getName方法；");
        return providerService.getName();
    }

    @RequestMapping("/getEmployeeTest")
    @ResponseBody
    public String getEmployeeTest() {
        System.out.println("customer调用了getEmployee方法；");
        return providerService.getEmployee().toString();
    }
}
