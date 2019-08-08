package com.laofaner.javaFoundation.opensourcetools.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.util.List;

/**
 * @BelongsProject: JavaSourceCodeLearning
 * @BelongsPackage: com.laofaner.opensourcetools
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-02 15:57
 * @Description: TODO
 * @Version 1.0
 */

@Data
public class OrderVO extends BaseRowModel {

    @ExcelProperty(value = {"订单号","订单号"},index = 0)
    private String orderNo;
    @ExcelProperty(value = {"账单","账单号"},index = 1)
    private String billNo;
    @ExcelProperty(value = {"账单","账单金额"},index = 1)
    private String billAmount;
    @ExcelProperty(value = {"姓名","姓名"},index = 2)
    private String name;
    @ExcelProperty(value = {"性别","性别"},index = 3)
    private String sex;
    @ExcelProperty(index = 4)
    private List<BillImportVO> children;

}
