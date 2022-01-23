package com.laofaner.popularTools;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class HutoolDemo01 {
    public static void main(String[] args) {
        String pureDatePattern = DatePattern.PURE_DATE_PATTERN;
        String format = DateUtil.format(new Date(), pureDatePattern);
        System.out.println(format);

    }

}
