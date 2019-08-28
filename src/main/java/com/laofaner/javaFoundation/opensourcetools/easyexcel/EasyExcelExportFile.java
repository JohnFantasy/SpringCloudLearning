package com.laofaner.javaFoundation.opensourcetools.easyexcel;

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
        for (BillImportVO vo : allRows) {
            System.out.println(vo);
        }

        //2、生成Excel
        OutputStream out = null;
        try {
            out = new FileOutputStream("C:\\Users\\fanyuzhuo\\Desktop\\77.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> testListString = new ArrayList<>();
        testListString.add("1234567890");
        testListString.add("gfdsgf");
        testListString.add("fvdavfds");
        testListString.add("vfdfdvs");
        List<String> testListString2 = new ArrayList<>();
        testListString2.add("gres");
        testListString2.add("个人");
        testListString2.add("5643");
        testListString2.add("86754fds");

        List<List<String>> data = new ArrayList<>();
        data.add(testListString);
        data.add(testListString2);


        try {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
            //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
            Sheet sheet1 = new Sheet(1, 0);
            sheet1.setSheetName("第一个sheet");
            writer.write0(data, sheet1);
            writer.merge(1, 2, 0, 0);
            writer.merge(1, 2, 1, 1);
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
