package com.laofaner.springboot.service.mock;

import com.laofaner.springboot.common.ReturnModel;
import com.laofaner.springboot.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.service
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-04 23:40
 * @Description: TODO
 * @Version 1.0
 */

@Service
public class MockOrderService {

    @Autowired
    private OrderMapper orderMapper;

    public ReturnModel insertSomeOrders(){
        return new ReturnModel();
    }



}
