package com.laofaner.springboot.domain.vo;

import com.laofaner.springboot.domain.entity.BillEntity;
import com.laofaner.springboot.domain.entity.OrderEntity;
import lombok.Data;

import java.util.List;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.domain.vo
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-07 14:58
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class OrderBillVO extends OrderEntity {

    private List<BillEntity> bills;

}
