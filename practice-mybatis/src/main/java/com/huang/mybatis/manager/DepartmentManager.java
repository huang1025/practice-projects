package com.huang.mybatis.manager;

import com.huang.mybatis.config.MyBatisCofing;
import com.huang.mybatis.dto.Department;
import com.huang.mybatis.mapper.DepartmentMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by huang_jiangling on 2017/11/13.
 */
public class DepartmentManager {

    public static void main(String[] args) {
        selectKeyTest();
    }

    /**
     * 测试 selectKey；
     */
    private static void selectKeyTest() {
        SqlSession session = MyBatisCofing.getSession();
        DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);
        Department department = new Department("dept");
        System.out.println(department);
        int insert = mapper.insert(department);
        System.out.println(insert);
        System.out.println(department);
        session.commit();
    }

}
