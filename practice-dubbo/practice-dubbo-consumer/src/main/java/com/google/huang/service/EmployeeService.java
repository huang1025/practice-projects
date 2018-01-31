package com.google.huang.service;

import com.google.huang.domain.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/7/24 0024.
 */
@Service
public class EmployeeService {

    @Autowired
    SessionFactory sessionFactory;

    public void svae(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}
