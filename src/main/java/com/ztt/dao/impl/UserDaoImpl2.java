/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserDaoImpl2
 * Author:   ZTT
 * Date:     2019/5/19/0019 11:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.dao.impl;

import com.ztt.pojo.User;
import com.ztt.Utils.UserRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZTT
 * @create 2019/5/19/0019
 * @since 1.0.0
 */
public class UserDaoImpl2 extends JdbcDaoSupport {
    public User findUserById(int id){
        List<User> users = getJdbcTemplate().query("select * from user where id = ?", new UserRowMapper(), id);
        return users.isEmpty()?null:users.get(0);

    }
}
