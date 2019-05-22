/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IUserDao
 * Author:   ZTT
 * Date:     2019/5/17/0017 8:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.dao;

import com.ztt.pojo.User;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZTT
 * @create 2019/5/17/0017
 * @since 1.0.0
 */
public interface IUserDao {

    /*根据id查询用户信息*/
    User findUserById(Integer id);

    /*根据名称查询用户信息*/
    User findUserByName(String name);

    /*更新用户信息*/
    void updateUser(User user);
}
