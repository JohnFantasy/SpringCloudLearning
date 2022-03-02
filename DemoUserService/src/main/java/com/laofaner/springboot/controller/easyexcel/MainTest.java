package com.laofaner.springboot.controller.easyexcel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.apache.xmlbeans.impl.jam.JComment;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 测试数据导出
 * @author: fyz
 * @create: 2019-12-04 16:59
 **/
public class MainTest {
    public static void main(String[] args) {
        String string ="comment on column LOAD_WHITELIST.CUSID is '客户号'\n" +
                "comment on column LOAD_WHITELIST.ORG_NAME is '支行名称'\n" +
                "comment on column LOAD_WHITELIST.ORG_ID is '支行号'\n" +
                "comment on column LOAD_WHITELIST.CUSNAME is '客户姓名'\n" +
                "comment on column LOAD_WHITELIST.IDTYPE is '身份证类型'\n" +
                "comment on column LOAD_WHITELIST.IDCARD is '身份证号'\n" +
                "comment on column LOAD_WHITELIST.LOADTYPE is '贷款类型'\n" +
                "comment on column LOAD_WHITELIST.CREDIT is '授信额度'\n" +
                "comment on column LOAD_WHITELIST.CREDIT_USED is '已用额度'\n" +
                "comment on column LOAD_WHITELIST.CREDIT_DATE is '授信日期'\n" +
                "comment on column LOAD_WHITELIST.CREDIT_TODATE is '预授信有效期至'\n" +
                "comment on column LOAD_WHITELIST.ADRESS is '常驻地址'\n" +
                "comment on column LOAD_WHITELIST.CARDNUMBER is '放款卡号'\n" +
                "comment on column LOAD_WHITELIST.BAK1 is '预留字段'\n" +
                "comment on column LOAD_WHITELIST.BAK2 is '预留字段'\n" +
                "comment on column LOAD_WHITELIST.BAK3 is '预留字段'\n" +
                "comment on column LOAD_WHITELIST.PHONE is '手机号'";
        String text = string;
//        System.out.println(text);
        String[] lines = text.split("\n");
        System.out.println(lines.length);
        for(String line: lines){
            String columnName = line.substring(line.indexOf("column")+7,line.indexOf(" is"));
            columnName = columnName.substring(columnName.indexOf(".")+1);
            if(line.contains("comment")){
                String comment = line.substring(line.indexOf("is ")+4,line.length()-1);
                if(comment.contains("'")){
                    comment =comment.replace("'","");
                }
                if(comment.contains("\n")){
                    comment =comment.replace("\n","");
                }
                System.out.println(columnName+"\t"+ comment+"\tVARCHAR2\tYes\tNULL");

            }

        }

    }
}
