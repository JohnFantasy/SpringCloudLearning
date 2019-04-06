package com.laofaner.springboot.mapper;

import com.laofaner.springboot.domain.entity.BillEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BillMapper {
    int insert(BillEntity record);

    int insertSelective(BillEntity record);
}