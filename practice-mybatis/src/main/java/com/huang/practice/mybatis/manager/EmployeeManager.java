package com.huang.practice.mybatis.manager;

import com.huang.practice.mybatis.config.MyBatisCofing;
import com.huang.practice.mybatis.dto.Employee;
import com.huang.practice.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

/**
 * Created by huang_jiangling on 2017/11/13.
 */
public class EmployeeManager {
    public static void main(String[] args) throws IOException {
        associationTest();
    }

    /**
     * association 测试；
     */
    private static void associationTest() {
        SqlSession session = MyBatisCofing.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee employee = mapper.get(1);
        System.out.println(employee);
        session.commit();
    }

    /**
     * selectKey 测试；
     */
    private static void selectKeyTest() throws IOException {
        SqlSessionFactory sessionFactory = MyBatisCofing.getFactoryWithXML();
        SqlSession session = sessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee em = new Employee("xixi", 12);
        System.out.println(em);
        mapper.insert2(em);
        System.out.println(em);
        session.commit();
    }

    /**
     * 使用主键回填测试；
     */
    private static void useGeneratedKeyTest() throws IOException {
        SqlSessionFactory sessionFactory = MyBatisCofing.getFactoryWithXML();
        SqlSession sqlSession = sessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee select = mapper.select(12);
        System.out.println(select);
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

        Employee select = mapper.select(12);
        System.out.println(select);

        int deleteNum = mapper.delete(11);
        System.out.println(deleteNum);

        sqlSession.commit();
    }

    private static void userSQL() throws IOException {
        SqlSessionFactory sessionFactory = MyBatisCofing.getFactoryWithXML();
        SqlSession session = sessionFactory.openSession();

        Employee employee = new Employee("huang", 17);
        int insert = session.insert("com.huang.mybatis.mapper.EmployeeMapper.insert", employee);
        System.out.println(insert);//1
        System.out.println(employee);//{"age":17,"id":15,"name":"huang"}

        employee = new Employee(1, "huang", 16);
        int update = session.update("com.huang.mybatis.mapper.EmployeeMapper.update", employee);
        System.out.println(update);//1

        Employee employee1 = session.<Employee>selectOne("com.huang.mybatis.mapper.EmployeeMapper.select", 12);
        System.out.println(employee1);//{"age":17,"id":12,"name":"huang"}


        int delete = session.delete("com.huang.mybatis.mapper.EmployeeMapper.delete", 1);
        System.out.println(delete);//0

        session.commit();
    }
}
