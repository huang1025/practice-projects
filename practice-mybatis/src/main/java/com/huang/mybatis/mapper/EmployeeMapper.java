package com.huang.mybatis.mapper;

import com.huang.mybatis.dto.Employee;

public interface EmployeeMapper {

    int insert(Employee employee);

    int insert2(Employee employee);

    int update(Employee employee);

    Employee select(int id);

    int delete(int id);

    Employee get(int id);
}
