/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IAccountService
 * Author:   ZTT
 * Date:     2019/5/19/0019 14:42
 * Description: 描述业务层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.service;

import com.ztt.pojo.Account;

/**
 * 〈一句话功能简述〉<br> 
 * 〈描述业务层〉
 *
 * @author ZTT
 * @create 2019/5/19/0019
 * @since 1.0.0
 */
public interface IAccountService {
    //根据id查询账户信息
    public Account findAccountById(Integer id);

    //转账
    public void transfer(String sourceName,String targeName,Float money);
}
