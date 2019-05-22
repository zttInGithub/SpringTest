/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserRowMapper
 * Author:   ZTT
 * Date:     2019/5/16/0016 23:08
 * Description: ceshi
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.Utils;

import com.ztt.pojo.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 〈一句话功能简述〉<br> 
 * 〈ceshi〉
 *
 * @author ZTT
 * @create 2019/5/16/0016
 * @since 1.0.0
 */
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setAge(resultSet.getInt("age"));
        user.setAddress(resultSet.getString("address"));
        return user;
    }
}
