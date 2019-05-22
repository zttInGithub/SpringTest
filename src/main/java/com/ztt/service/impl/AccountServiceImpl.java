/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AccountServiceImpl
 * Author:   ZTT
 * Date:     2019/5/19/0019 14:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.service.impl;

import com.ztt.dao.IAccountDao;
import com.ztt.pojo.Account;
import com.ztt.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZTT
 * @create 2019/5/19/0019
 * @since 1.0.0
 */
@Service("accountService")
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    /*public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }*/

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void transfer(String sourceName, String targeName, Float money) {
        //1、根据名称查询两个账户
        Account source = accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targeName);
        //2、修改两个账户的金额
        source.setMoney(source.getMoney()-money);//转出账户减钱
        target.setMoney(target.getMoney()+money);//转入账户加钱
        //3、更新两个账户
        accountDao.updateAccount(source);
        accountDao.out();
        int i = 1/0;
        accountDao.updateAccount(target);
        accountDao.in();
    }
}
