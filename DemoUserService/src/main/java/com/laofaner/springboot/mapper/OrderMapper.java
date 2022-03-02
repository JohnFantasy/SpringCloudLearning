package com.laofaner.springboot.mapper;

import com.laofaner.springboot.domain.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {
    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    @Select("select * from t_order where order_no = #{orderNo}")
    OrderEntity selectByPrimaryKey(String orderNo);

    //where user_id = #{userId}
//    @Select("select * from t_order ")
    List<OrderEntity> selectByUserId(String userId);
}