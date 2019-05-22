/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CustomerServiceTest
 * Author:   ZTT
 * Date:     2019/5/14/0014 21:20
 * Description: 测试aop
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.service;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试aop〉
 *
 * @author ZTT
 * @create 2019/5/14/0014
 * @since 1.0.0
 */
public class CustomerServiceTest {

    @Test
    public void test2(){
        // 1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 2.取出Bean容器中的实例
        ICustomerService customerService = (ICustomerService) context.getBean("customerService");
        // 3.调用bean方法
        customerService.saveCustomer();

    }

    @Test
    public void test3(){
        // 1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 2.取出Bean容器中的实例
        ICustomerService customerService = (ICustomerService) context.getBean("customerService");
        // 3.调用bean方法
        customerService.updateCustomer(1);
    }
}
