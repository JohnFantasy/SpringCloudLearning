package com.laofaner.springboot.mapper.base ;

import com.laofaner.springboot.domain.TBill;

import java.util.List;
/**
*  @author author
*/
public interface TBillBaseMapper {

    int insertTBill(TBill object);

    int updateTBill(TBill object);

    int update(TBill.UpdateBuilder object);

    List<TBill> queryTBill(TBill object);

    TBill queryTBillLimit1(TBill object);

}