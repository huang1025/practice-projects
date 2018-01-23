package com.huang.spring2.scan;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by huang_jiangling on 2017/10/31.
 */
@Service
public class EmployeeSevice {

    @PostConstruct
    public void hehe() {
        System.out.println("EmployeeService->hehe");
    }
}
