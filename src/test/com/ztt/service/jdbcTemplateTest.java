/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: jdbcTemplateTest
 * Author:   ZTT
 * Date:     2019/5/16/0016 22:32
 * Description: jdbcTemplate模板测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.service;

import com.ztt.dao.IUserDao;
import com.ztt.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈jdbcTemplate模板测试〉
 *
 * @author ZTT
 * @create 2019/5/16/0016
 * @since 1.0.0
 */
public class jdbcTemplateTest {

    @Test
    public void jdbcTemplateDaoTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //根据id获取bean的对象
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao2");
        User user1 = userDao.findUserById(3);
        System.out.println(user1);

       /* User user2 = userDao.findUserByName("王八");
        System.out.println(user2);

        User user = new User();
        user.setAge(50);
        user.setAddress("山西");
        user.setId(2);
        user.setName("小涛");
        userDao.updateUser(user);*/
    }

    //public static void main(String[] args) {
      //  JdbcTemplate jdbcTemplate = getJdbcTemplate();
        //插入操作
       // jdbcTemplate.execute("insert into user(id,name,age,address) values (5,'王八',18,'福建')");
        //修改操作
       // jdbcTemplate.execute("update user set age = 20 where id = 5");

       // jdbcTemplate.update("update user set age = 20 where id = ?",3);
        //删除操作
       // jdbcTemplate.update("delete from user where id = ?",5);
        //查询所有（RowMapper）
        /*List<User> users = jdbcTemplate.query("select * from user where age > ?", new UserRowMapper(), 20);
        for(User user : users){
            System.out.println(user);
        }*/
        //查询一个(RowMapper方式)
        /*List<User> users = jdbcTemplate.query("select * from user where id = ?", new UserRowMapper(), 4);
        System.out.println(users.isEmpty()?"没有结果":users.get(0));*/
        //查询返回一行一列的操作
        /*Integer integer = jdbcTemplate.queryForObject("select count(*) from user where age > ?", Integer.class, 20);
        System.out.println(integer);*/
   // }
}

