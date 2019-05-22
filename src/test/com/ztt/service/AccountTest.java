/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AccountTest
 * Author:   ZTT
 * Date:     2019/5/19/0019 16:40
 * Description: 事务测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.service;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈事务测试〉
 *
 * @author ZTT
 * @create 2019/5/19/0019
 * @since 1.0.0
 */

@Configuration//注解类
@ContextConfiguration(classes = AccountTest.class)//家在当前注解类
@ComponentScan(basePackages = {"com.ztt"})
@EnableTransactionManagement//开启spring对注解事务的支持
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void demo(){
        accountService.transfer("张三","李四",500f);
    }

    //定义数据源@Bean方法的返回值 进入容器
    @Bean(name = "dataSource")
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ssmTest");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("root");
        return comboPooledDataSource;
    }

    //定义模板
    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(@Qualifier("dataSource") DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //定义事务管理平台
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier("dataSource") DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }







    /*@Test
    public void transferTest(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        IAccountService accountService = (IAccountService) app.getBean("accountService");
        accountService.transfer("张三","李四",500F);
    }*/
}
