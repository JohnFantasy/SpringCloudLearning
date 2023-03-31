package com.laofaner.springboot.controller.easyexcel;

import com.laofaner.springboot.service.easyexcel.EasyExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.controller.easyexcel
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-04 23:20
 * @Description: TODO
 * @Version 1.0
 */

@RestController
@RequestMapping(value = "easyexcel")
public class EasyExcelController {

    @Autowired
    private EasyExcelService easyExcelService;

    @RequestMapping(value = "exportExcel", method = RequestMethod.GET)
    public String exportOrderData(HttpServletResponse response) {
        easyExcelService.exportExcel(response);
        return "export SUCCESS";
    }


    @RequestMapping(value = "importExcel", method = RequestMethod.GET)
    public String importOrderData() {


        return "import SUCCESS";
    }
}
