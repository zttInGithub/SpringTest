/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloServiceTest
 * Author:   ZTT
 * Date:     2019/5/9/0009 21:49
 * Description: 测试spring是否搭建成功
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试spring是否搭建成功〉
 *
 * @author ZTT
 * @create 2019/5/9/0009
 * @since 1.0.0
 */
public class HelloServiceTest {

    @Test
    public void test1(){
        // 1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 2.取出Bean容器中的实例
        HelloService helloService = (HelloService)context.getBean("helloService");
        // 3.调用bean方法
        helloService.hello();
    }
}
