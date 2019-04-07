package com.laofaner.springboot.mapper;

import com.laofaner.springboot.domain.entity.BillEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BillMapper {
    int insert(BillEntity record);

    int insertSelective(BillEntity record);

//    @Select("select * from t_bill where order_no = #{orderNo}")
    List<BillEntity> selectBillsByOrderNo(String orderNo);
}