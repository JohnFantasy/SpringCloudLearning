package com.laofaner.springboot.service.easyexcel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.laofaner.springboot.common.ReturnModel;
import com.laofaner.springboot.domain.entity.BillEntity;
import com.laofaner.springboot.domain.entity.OrderEntity;
import com.laofaner.springboot.domain.vo.OrderBillVO;
import com.laofaner.springboot.mapper.BillMapper;
import com.laofaner.springboot.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.service.easyexcel
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-07 14:37
 * @Description: TODO
 * @Version 1.0
 */

@Service
public class EasyExcelService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private BillMapper billMapper;

    public ReturnModel importExcel() {

        OrderEntity orderEntity = new OrderEntity();
        for (int i = 0; i < 10; i++) {
            orderEntity.setOrderNo("201904071442430000" + i);
            orderEntity.setUserId("fanyuzhuoTest1");
            orderEntity.setStatus(0);
            orderEntity.setOrderAmount(1D);
            orderEntity.setCreateTime(new Date());
            orderEntity.setUpdateTime(new Date());

            try {
                orderMapper.insert(orderEntity);
            } catch (Exception e) {
                continue;
            }
        }
        BillEntity billEntity = new BillEntity();
        for (int i = 0; i < 10; i++) {
            billEntity.setBillNo("BILL201904071450" + i);
            billEntity.setBillAmount(0.01);
            billEntity.setOrderNo("2019040714424300002");
            billEntity.setCreateTime(new Date());
            billEntity.setUpdateTime(new Date());
            if (billMapper.insertSelective(billEntity) < 1) {
                continue;
            }
        }
        return null;
    }

    public ReturnModel exportExcel(HttpServletResponse response) {

        String userId = "fanyuzhuoTest1";
        List<OrderEntity> orders = orderMapper.selectByUserId(userId);
        System.out.println(orders);
        List<BillEntity> bills;

        List<OrderBillVO> list = new ArrayList<>();

        for (OrderEntity orderEntity : orders) {
            bills = billMapper.selectBillsByOrderNo(orderEntity.getOrderNo());
            System.out.println(bills);
            OrderBillVO orderBillVO = new OrderBillVO();
            orderBillVO.setOrderNo(orderEntity.getOrderNo());
            orderBillVO.setUserId(orderEntity.getOrderNo());
            orderBillVO.setStatus(orderEntity.getStatus());
            orderBillVO.setOrderAmount(orderEntity.getOrderAmount());
            orderBillVO.setCreateTime(orderEntity.getCreateTime());
            orderBillVO.setUpdateTime(orderEntity.getUpdateTime());
            orderBillVO.setBills(bills);
            list.add(orderBillVO);
            System.out.println(list);
        }


        //1、初始化sheet数据对象
        List<List<String>> datas = new ArrayList<>();
        //2、初始化列标题行数据对象
        List<String> headRow = new ArrayList<>();
        String[] rowsName = new String[]{"订单号", "订单金额", "用户ID", "订单状态", "创建时间", "更新时间", "账单号", "账单金额", "订单号", "创建时间", "更新时间"};
        for (String head : rowsName) {
            headRow.add(head);
        }
        //3、sheet中假如标题行
        datas.add(headRow);


        //需要合并的单元格坐标二维数组
        List<int[]> coor = new ArrayList<>();

        int firstRow = 1;
        int lastRow = 1;
        for (int i = 0; i < list.size(); i++) {
            OrderBillVO orderBillVO = list.get(i);
            String orderNo = orderBillVO.getOrderNo();
            String orderAmount = String.valueOf(orderBillVO.getOrderAmount());
            String user = orderBillVO.getUserId();
            String status = String.valueOf(orderBillVO.getStatus());
            String createTime = String.valueOf(orderBillVO.getCreateTime());
            String updateTime = String.valueOf(orderBillVO.getUpdateTime());
            List<BillEntity> billList = orderBillVO.getBills();
            //如果账单列表不为空
            if (billList != null && billList.size() > 0) {
                int a = billList.size();
                firstRow = lastRow + 1;
                lastRow += a;
                coor.add(new int[]{firstRow, lastRow});
                for (BillEntity billEntity : billList) {
                    //4、开始组装订单和账单数据（从第二行开始）
                    List<String> rowData = new ArrayList<>();
                    rowData.add(orderNo);
                    rowData.add(orderAmount);
                    rowData.add(user);
                    rowData.add(status);
                    rowData.add(createTime);
                    rowData.add(updateTime);
                    rowData.add(billEntity.getBillNo());
                    rowData.add(String.valueOf(billEntity.getBillAmount()));
                    rowData.add(billEntity.getOrderNo());
                    rowData.add(billEntity.getCreateTime().toString());
                    rowData.add(billEntity.getUpdateTime().toString());
                    datas.add(rowData);
                }
            } else {
                lastRow += 1;
                //4、开始组装订单和账单数据（从第二行开始）
                List<String> rowData = new ArrayList<>();
                rowData.add(orderNo);
                rowData.add(orderAmount);
                rowData.add(user);
                rowData.add(status);
                rowData.add(createTime);
                rowData.add(updateTime);
                rowData.add("");
                rowData.add("");
                rowData.add("");
                rowData.add("");
                rowData.add("");
                datas.add(rowData);
            }
        }

        OutputStream out = null;
        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition", "attachment;filename=订单账单" + ".xlsx");
            out = response.getOutputStream();
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
            //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
            Sheet sheet1 = new Sheet(1);
            System.out.println(sheet1.getHeadLineMun());
            System.out.println(sheet1.getHead());
            sheet1.setSheetName("订单账单");
            writer.write0(datas, sheet1);
            for (int i = 0; i < coor.size(); i++) {
                writer.merge(coor.get(i)[0], coor.get(i)[1], 0, 0);
                writer.merge(coor.get(i)[0], coor.get(i)[1], 1, 1);
                writer.merge(coor.get(i)[0], coor.get(i)[1], 2, 2);
                writer.merge(coor.get(i)[0], coor.get(i)[1], 3, 3);
                writer.merge(coor.get(i)[0], coor.get(i)[1], 4, 4);
                writer.merge(coor.get(i)[0], coor.get(i)[1], 5, 5);
            }
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }
}
