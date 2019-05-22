package com.ztt.dao;

import com.ztt.pojo.Account;

public interface IAccountDao {

    Account findAccountById(Integer id);

    Account findAccountByName(String name);

    void updateAccount(Account account);

    void in();

    void out();
}
