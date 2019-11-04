package com.laofaner.javaFoundation.collection.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 测试20W+条集合数据内存占用情况
 * @author: fyz
 * @create: 2019-11-04 15:49
 **/
public class ThousandsOfThousandObjectTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=0 ;i<300000;i++){
            list.add("this is the "+i+"element\n");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(String str : list){
            stringBuilder.append(str);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\laofa\\Desktop\\test.txt"));
            fileOutputStream.write(stringBuilder.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
