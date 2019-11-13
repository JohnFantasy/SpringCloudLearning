package com.laofaner.javaFoundation.StringUtil;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 测试|!拆分字符串
 * @author: fyz
 * @create: 2019-11-13 17:15
 **/
public class StringSplitTest2 {

    public static void main(String[] args) {
        String str = "a|!b|!c|!d|!|!|!|!";
        str = str.replace("|!","|!#");
        System.out.println(str);
        String[] strs = str.split("\\|!");
        System.out.println(strs.length);
        for(int i= 0;i<strs.length;i++){
            strs[i] = strs[i].replace("#","");
            System.out.println(strs[i]);

        }
    }
}
