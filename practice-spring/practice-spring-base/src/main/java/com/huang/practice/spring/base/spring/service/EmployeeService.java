package com.huang.practice.spring.base.spring.service;

import org.springframework.stereotype.Service;

/**
 * Created by huang on 2017/7/13.
 */
@Service
public class EmployeeService {

    public String getEmployeeName(int id) {
        return "huang" + id;
    }

    public String getName(int id) {
        return id + "";
    }

    public String getInfo(int id, String name) {
        return "getInfo,id:" + id + ",name:" + name;
    }
}
