package com.laofaner.springboot.mapper;

import com.laofaner.springboot.domain.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);
}