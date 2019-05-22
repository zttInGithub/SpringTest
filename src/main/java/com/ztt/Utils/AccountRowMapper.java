/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AccountRowMapper
 * Author:   ZTT
 * Date:     2019/5/19/0019 15:14
 * Description: 转账接收数据
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.Utils;

import com.ztt.pojo.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈转账接收数据〉
 *
 * @author ZTT
 * @create 2019/5/19/0019
 * @since 1.0.0
 */
public class AccountRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setMoney(resultSet.getFloat("money"));
        account.setName(resultSet.getString("name"));
        return account;
    }
}
