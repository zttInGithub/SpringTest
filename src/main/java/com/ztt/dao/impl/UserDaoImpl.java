/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserDaoImpl
 * Author:   ZTT
 * Date:     2019/5/17/0017 8:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.dao.impl;

import com.ztt.dao.IUserDao;
import com.ztt.pojo.User;
import com.ztt.Utils.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZTT
 * @create 2019/5/17/0017
 * @since 1.0.0
 */
public class UserDaoImpl implements IUserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User findUserById(Integer id) {
        List<User> users = jdbcTemplate.query("select * from user where id  = ?", new UserRowMapper(), id);

        return users.isEmpty()?null:users.get(0);
    }

    @Override
    public User findUserByName(String name) {
        List<User> users = jdbcTemplate.query("select * from user where name = ?", new UserRowMapper(), name);
        if(users.isEmpty()){
            return null;
        }
        if(users.size() > 1){
            throw new RuntimeException("结果集不唯一，不是只有一个账户对象");
        }
        return users.get(0);
    }

    @Override
    public void updateUser(User user) {
        jdbcTemplate.update("update user set age = ? where id = ?",user.getAge(),user.getId());
    }
}
