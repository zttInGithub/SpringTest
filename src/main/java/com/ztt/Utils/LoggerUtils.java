/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LoggerUtils
 * Author:   ZTT
 * Date:     2019/5/9/0009 22:17
 * Description: 日志记录
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.Utils;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈日志记录〉
 *
 * @author ZTT
 * @create 2019/5/9/0009
 * @since 1.0.0
 */
@Component("loggerUtils")
@Aspect//表明当前类是一个切面类
public class LoggerUtils {
    /*此方法在核心业务执行之前就记录日志*/
   @Before("execution(* com.ztt.service.impl.*.*(..))")
    public void beforePrintLog(){
        System.out.println("Logger类中的printLog方法开始记录日志了。。。。");
    }

    @After("execution(* com.ztt.service.impl.*.*(..))")
    public void afterPrintLog(){
        System.out.println("Logger类中的afterPrintLog方法开始记录日志了。。。。");
    }

    public void aroundPrintLog(){
        System.out.println("Logger类中的aroundPrintLog方法开始记录日志了。。。。");
    }

    public void afterThrowingPrintLog(){
        System.out.println("Logger类中的afterThrowingPrintLog方法开始记录日志了。。。。");
    }

    public void afterReturningPrintLog(){
        System.out.println("Logger类中的afterReturningPrintLog方法开始记录日志了。。。。");
    }
}
