package com.laofaner.javasourcecode.opensourcetools.easyexcel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @BelongsProject: JavaSourceCodeLearning
 * @BelongsPackage: com.laofaner.opensourcetools
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-02 15:14
 * @Description: TODO
 * @Version 1.0
 */
public class EasyExcelExportFile {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        //1、读取Excel
        BillExcelListener listener = new BillExcelListener();
        ExcelReader excelReader = null;
        File file = new File("C:\\Users\\fanyuzhuo\\Desktop\\billImport.xls");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            excelReader = new ExcelReader(fileInputStream, ExcelTypeEnum.XLS, null, listener);
        } catch (Exception e) {
            logger.info("Exception happened :" + e.getMessage());
        }
        excelReader.read(new Sheet(1, 0, BillImportVO.class));
        List<BillImportVO> allRows = listener.getDatas();
        for(BillImportVO vo : allRows){
            System.out.println(vo);
        }

        //2、生成Excel
        OutputStream out = null;
        try {
            out = new FileOutputStream("C:\\Users\\fanyuzhuo\\Desktop\\77.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<TestVO> testList = new ArrayList<>();
//        List<TestChild> childList = new ArrayList<>();
//        TestChild testChild = new TestChild();
//        testChild.setCommunityName("this is a new community");
//        childList.add(testChild);
        TestVO testVO = new TestVO();
        testVO.setOrderNo("1234567890");
        testVO.setBillNo("1243");
        testVO.setBillAmount("100");
        testVO.setName("zhangsan");
        testVO.setSex("男");
        testVO.setChildren(allRows);
        TestVO testVO2 = new TestVO();
        testVO2.setOrderNo("987654321");
        testVO2.setBillNo("4321");
        testVO2.setBillAmount("0.01");
        testVO2.setName("lisi");
        testVO2.setSex("nv");
        testVO2.setChildren(allRows);
        testList.add(testVO2);
        testList.add(testVO);


        try {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLS,true);
            //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
            Sheet sheet1 = new Sheet(1, 0,TestVO.class);
            sheet1.setSheetName("第一个sheet");
            writer.write(testList, sheet1);
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

    }




}
