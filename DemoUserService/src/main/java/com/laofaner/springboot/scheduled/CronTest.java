package com.laofaner.springboot.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author fyz
 * @Date 2022/6/16 14:58
 * @Description TODO
 **/

@Service
public class CronTest {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "*/90 * * * * ?")
    public void test() {
        System.out.println(sdf.format(new Date()));
    }

    @Scheduled(cron = "1/5 * * * * ?")
    public void test1() {
        System.out.println("1、5秒执行：：："+sdf.format(new Date()));
    }
}
