package com.huang.mybatis.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;
import java.io.InputStream;


public class MyBatisCofing {

    private static SqlSessionFactory sessionFactory;

    public static SqlSessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            synchronized (MyBatisCofing.class) {
                if (sessionFactory == null) {
                    try {
                        sessionFactory = getFactoryWithXML();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return sessionFactory;
    }

    public static SqlSession getSession() {
        return getSessionFactory().openSession();
    }


    public static SqlSessionFactory getFactoryWithJava() {

        //获取连接池；
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/huang");
        dataSource.setUsername("root");
        dataSource.setPassword("huang");

        //获取事务管理器；
        JdbcTransactionFactory transactionFactory = new JdbcTransactionFactory();

        //获取数据库运行环境；
        Environment environment = new Environment("dev", transactionFactory, dataSource);

        //构建配置对象；
        Configuration configuration = new Configuration(environment);

        //注册别名；
        configuration.getTypeAliasRegistry().registerAlias("hehe", MyBatisCofing.class);

        //加入映射器；
        configuration.addMapper(Object.class);

        //构建SessionFactory对象；
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        return sessionFactory;
    }

    public static SqlSessionFactory getFactoryWithXML() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resource);
        return sessionFactory;
    }
}
