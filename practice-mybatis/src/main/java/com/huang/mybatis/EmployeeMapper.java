package com.huang.mybatis;

public interface EmployeeMapper {

    int insert(Employee employee);

    int update(Employee employee);

    Employee select(int id);

    int delete(int id);
}
