package com.laofaner.springboot.controller.easyexcel;

import cn.hutool.core.date.DateUtil;
import com.laofaner.springboot.service.easyexcel.EasyExcelService;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

    public void test() {
        String format = DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(format);
    }

    private final EasyExcelService easyExcelService;

    public EasyExcelController(EasyExcelService easyExcelService) {
        this.easyExcelService = easyExcelService;
    }

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
