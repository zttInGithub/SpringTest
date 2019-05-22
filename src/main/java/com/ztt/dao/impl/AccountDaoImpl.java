/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AccountDaoImpl
 * Author:   ZTT
 * Date:     2019/5/19/0019 15:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.dao.impl;

import com.ztt.Utils.AccountRowMapper;
import com.ztt.dao.IAccountDao;
import com.ztt.pojo.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZTT
 * @create 2019/5/19/0019
 * @since 1.0.0
 */


public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    @Override
    public Account findAccountById(Integer id) {
        List<Account> accounts = getJdbcTemplate().query("select * from account where id = ?", new AccountRowMapper(), id);
        return accounts.isEmpty()?null:accounts.get(0);
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> accounts = getJdbcTemplate().query("select * from account where name = ?", new AccountRowMapper(), name);
        if(accounts.isEmpty()){
            return null;
        }
        if(accounts.size()>1){
            throw new RuntimeException("结果集不唯一，不是只有一个账户对象");
        }
        return accounts.get(0);
    }

    @Override
    public void updateAccount(Account account) {
        getJdbcTemplate().update("update account set money = ? where id = ?",account.getMoney(),account.getId());
    }

    @Override
    public void in() {
        System.out.println("转入成功");
    }

    @Override
    public void out() {
        System.out.println("转出成功");
    }
}
