package com.laofaner.springboot.easyexcel;

import com.laofaner.springboot.service.easyexcel.EasyExcelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.easyexcel
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-07 14:44
 * @Description: TODO
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EasyExcelTests {

    @Autowired
    private EasyExcelService easyExcelService;

    @Test
    public void InsertTest(){
        easyExcelService.importExcel();
    }

//    @Test
//    public void ExportTest(){
//        easyExcelService.exportExcel(HttpServletResponse response);
//    }

}
