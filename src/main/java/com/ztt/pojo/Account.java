/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Account
 * Author:   ZTT
 * Date:     2019/5/19/0019 14:39
 * Description: 转账实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.pojo;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈转账实体类〉
 *
 * @author ZTT
 * @create 2019/5/19/0019
 * @since 1.0.0
 */
public class Account implements Serializable {
    private int id;
    private String name;
    private Float money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
