package com.laofaner.currenttest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-23 09:24
 * @description
 */
public class ReentrantLockTest1 {
    public static void main(String[] args) {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        reentrantLockExample.writer();
        reentrantLockExample.reader();
        System.out.println(reentrantLockExample.a);
        String str = "政工\t周晓娇\n" +
                "8支队\t淦琳\n" +
                "8支队\t王飞\n" +
                "12支队\t廖杰\n" +
                "3支队\t刘鹏\n" +
                "14支队\t龚沁蕊\n" +
                "32支队\t王慧娟\n" +
                "32支队\t马力\n" +
                "6支队\t邵彬\n" +
                "12支队\t杜琳\n" +
                "26支队\t李厚梁\n" +
                "26支队\t李响";
        String[] split = str.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
//            System.out.println(s);
            String[] split1 = s.split("\t");
//            for(int i=0;i< split1.length;i++){
//            System.out.println(split1[1]);
//            }
            sb.append("'");
            sb.append(split1[1]);
            sb.append("',");
        }
        System.out.println(sb);
    }
}

class ReentrantLockExample {
    int a = 0;
    ReentrantLock lock = new ReentrantLock();

    public void writer() {
        lock.lock();   // 获取锁
        try {
            a++;
        } finally {
            lock.unlock();// 释放锁
        }
    }

    public void reader() {
        lock.lock();  // 获取锁
        try {
            int i = a;
        } finally {
            lock.unlock(); // 释放锁
        }
    }
}