package com.huang.practice.activit.comfiguration;

import com.mysql.jdbc.Driver;
import org.activiti.engine.*;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

/**
 * Created by huang on 2017/7/1.
 */
@Configuration
public class ActivitiConfiguration {

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/huangMySQL");
        dataSource.setDriverClass(Driver.class);
        dataSource.setUsername("root");
        dataSource.setPassword("huang");
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }

    @Bean
    public SpringProcessEngineConfiguration processEngineConfiguration() {
        SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();
        configuration.setDataSource(dataSource());
        configuration.setTransactionManager(transactionManager());
        configuration.setDatabaseSchemaUpdate("true");
        configuration.setJobExecutorActivate(false);
        configuration.setDeploymentResources(new Resource[]{new ClassPathResource("activiti-bpmn/MyAcitivi.bpmn")});
        configuration.setLabelFontName("宋体");
        configuration.setActivityFontName("宋体");
        return configuration;
    }

    @Bean
    public ProcessEngineFactoryBean processEngineFactoryBean() {
        ProcessEngineFactoryBean processEngineFactoryBean = new ProcessEngineFactoryBean();
        processEngineFactoryBean.setProcessEngineConfiguration(processEngineConfiguration());
        return processEngineFactoryBean;
    }

    @Bean
    public RepositoryService repositoryService() throws Exception {
        return processEngineFactoryBean().getObject().getRepositoryService();
    }

    @Bean
    public RuntimeService runtimeService() throws Exception {
        return processEngineFactoryBean().getObject().getRuntimeService();
    }

    @Bean
    public TaskService taskService() throws Exception {
        return processEngineFactoryBean().getObject().getTaskService();
    }

    @Bean
    public HistoryService historyService() throws Exception {
        return processEngineFactoryBean().getObject().getHistoryService();
    }

    @Bean
    public ManagementService managementService() throws Exception {
        return processEngineFactoryBean().getObject().getManagementService();
    }

}

