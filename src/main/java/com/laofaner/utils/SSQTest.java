package com.laofaner.utils;

import cn.hutool.http.HttpUtil;

/**
 * @author fanyuzhuo
 * @createAt 2021-02-28 18:27
 * @description
 */
public class SSQTest {

    public static void main(String[] args) {
        String s = HttpUtil.get("http://182.92.109.149/getData/ssq.TXT");
        System.out.println(s);
    }
}
