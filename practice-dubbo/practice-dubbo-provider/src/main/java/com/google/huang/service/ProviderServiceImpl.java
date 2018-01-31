package com.google.huang.service;

import com.google.huang.domain.Employee;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/7/26 0026.
 */
public class ProviderServiceImpl implements ProviderService {

    public String getName() {
        System.out.println("provider的getName方法被调用");
        return "huang18";
    }

    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setIsValid(true);
        employee.setId(12);
        employee.setCreateTime(new Timestamp(System.currentTimeMillis()));
        employee.setName(getName() + "====" + "调用的是远程服务");
        return employee;
    }
}
