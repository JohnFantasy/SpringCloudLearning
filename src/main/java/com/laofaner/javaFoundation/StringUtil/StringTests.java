package com.laofaner.javaFoundation.StringUtil;

/**
 * @program: SpringBoot&SpringCloud
 * @description: String类代码研究学习
 * @author: fyz
 * @create: 2019-08-26 08:56
 **/
public class StringTests {

    public static void main(String[] args) {
        String a = "abc";
        String b = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        System.out.println(a == b);

        char[] chars = b.toCharArray();
        for (char aChar : chars) {
            System.out.println((int) aChar);
        }
        char ch = 58;
        System.out.println(ch);
        System.out.println(a.codePointAt(0));

        for(int i= 0;i<256;i++){
            System.out.println((char)i);
        }

        Integer integer = 1;
    }
}
