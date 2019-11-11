package com.laofaner.jvm.maizixueyuan;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 模拟内存溢出
 * @author: fyz
 * @create: 2019-11-07 11:46
 **/
public class OutOfMemoryTest {

    public static void main(String[] args) {
        List<Demo> list = new ArrayList<>();
        while(true){
            list.add(new Demo());
        }

    }
}

class Demo{

}
