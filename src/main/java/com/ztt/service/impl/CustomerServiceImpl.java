/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CustomerServiceImpl
 * Author:   ZTT
 * Date:     2019/5/9/0009 22:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ztt.service.impl;

import com.ztt.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZTT
 * @create 2019/5/9/0009
 * @since 1.0.0
 */
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

    @Override
    public void saveCustomer() {
        System.out.println("调用持久层，执行保存客户。。。。。。。。。");
    }

    @Override
    public void updateCustomer(int i) {
        System.out.println("调用持久层，执行修改客户。。。。。。。。。");

    }
}
