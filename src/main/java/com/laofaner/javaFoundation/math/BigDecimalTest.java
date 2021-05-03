package com.laofaner.javaFoundation.math;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author fanyuzhuo
 * @createAt 2021-03-29 19:41
 * @description
 */
public class BigDecimalTest {

    public static void main(String[] args) {
//        BigDecimal a = new BigDecimal(10).divide(new BigDecimal(30));
//        System.out.println(a);

        float num= (float)2/3;
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        String s = df.format(num);//返回的是String类型
        System.out.println(s);
    }
}
