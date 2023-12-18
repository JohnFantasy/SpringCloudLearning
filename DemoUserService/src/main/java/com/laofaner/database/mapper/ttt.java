package com.laofaner.database.mapper;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ttt {

    public static void testAddUser() {
//        redisUtil.set("username","zhangsan");
//        String username = redisUtil.get("username").toString();
//        System.out.println(111);
        List<ObjTest> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            ObjTest obj = new ObjTest();
//            if (i % 10 == 0) {
//                obj.setNum(0.0);
//            } else {
//
//            }
            obj.setNum(new Random().nextDouble() * 10);
//            obj.setNum(new Random().nextDouble());
            list.add(obj);
        }
//        list.sort((o1,o2)->Double.compare(o2.getNum(),o1.getNum()));
//        list.sort((o1,o2)->Double.compare(o2.getNum(),o1.getNum()));

//        list.sort((o1,o2)->o2.getNum()-o1.getNum()>0?1:-1);
        list.sort(Comparator.comparingDouble(ObjTest::getNum));
        System.out.println(list);
    }

    public static void main(String[] args) {
//        testAddUser();9223372036854775807
        System.out.println(Long.MAX_VALUE);
    }
}

@Data
class ObjTest {
    private String name;
    private Double num;
}
