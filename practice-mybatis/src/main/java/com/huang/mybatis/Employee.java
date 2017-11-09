package com.huang.mybatis;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

/**
 * Created by huang_jiangling on 2017/11/9.
 */
@Getter
@Setter
public class Employee {

    public Employee() {
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static void main(String[] args) throws IOException {
        userSQL();
    }

    private static void useMapper() throws IOException {
        SqlSessionFactory sessionFactory = MyBatisCofing.getFactoryWithXML();
        SqlSession sqlSession = sessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = new Employee("huang", 17);
        int insertNum = mapper.insert(employee);
        System.out.println(insertNum);
        System.out.println(employee);

        employee = new Employee(9, "huang", 12);
        int updateNum = mapper.update(employee);
        System.out.println(updateNum);

        Employee select = mapper.select(10);
        System.out.println(select);

        int deleteNum = mapper.delete(11);
        System.out.println(deleteNum);

        sqlSession.commit();
    }

    private static void userSQL() throws IOException {
        SqlSessionFactory sessionFactory = MyBatisCofing.getFactoryWithXML();
        SqlSession session = sessionFactory.openSession();

        Employee employee = new Employee("huang", 17);
        int insert = session.insert("com.huang.mybatis.EmployeeMapper.insert", employee);
        System.out.println(insert);//1
        System.out.println(employee);//{"age":17,"id":15,"name":"huang"}

        employee = new Employee(1, "huang", 16);
        int update = session.update("com.huang.mybatis.EmployeeMapper.update", employee);
        System.out.println(update);//1

        Employee employee1 = session.<Employee>selectOne("com.huang.mybatis.EmployeeMapper.select", 12);
        System.out.println(employee1);//{"age":17,"id":12,"name":"huang"}


        int delete = session.delete("com.huang.mybatis.EmployeeMapper.delete", 1);
        System.out.println(delete);//0

        session.commit();
    }
}
