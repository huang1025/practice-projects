package com.huang.practice.mockito.test;

import com.huang.practice.mockito.model.IEmployeeService;

import java.util.Date;

/**
 * Created by huang on 2017/7/8.
 */
public class EmployeeServiceImpl implements IEmployeeService {
    @Override
    public int getAge() {
        System.out.println("getAge is invoking...");
        return 17;
    }

    @Override
    public Date getSalaryDate() {
        return new Date();
    }

    String getName() {
        return "huang";
    }

    private String getDept() {
        return "信息技术部";
    }
}
