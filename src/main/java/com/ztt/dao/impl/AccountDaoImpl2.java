package com.ztt.dao.impl;

import com.ztt.Utils.AccountRowMapper;
import com.ztt.dao.IAccountDao;
import com.ztt.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl2 implements IAccountDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account findAccountById(Integer id) {
        List<Account> accounts = jdbcTemplate.query("select * from account where id = ?", new AccountRowMapper(), id);
        return accounts.isEmpty()?null:accounts.get(0);
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> accounts = jdbcTemplate.query("select * from account where name = ?", new AccountRowMapper(), name);
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
        jdbcTemplate.update("update account set money = ? where id = ?",account.getMoney(),account.getId());
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
