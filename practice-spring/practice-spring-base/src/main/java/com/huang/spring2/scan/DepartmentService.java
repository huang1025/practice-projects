package com.huang.spring2.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by huang_jiangling on 2017/10/31.
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentService(EmployeeSevice employeeService) {
        System.out.println("Autowired in construct ");
    }

    @Autowired
    private EmployeeSevice employeeService;

    @Autowired
    private void hehe(EmployeeSevice employeeService) {
        System.out.println("Autowired in private method ");
    }

    @Autowired
    public void xixi() {
        System.out.println("Autowired in method without args");
    }

    @PostConstruct
    public void haha() {
        System.out.println("DepartmentService->haha");
    }
}
