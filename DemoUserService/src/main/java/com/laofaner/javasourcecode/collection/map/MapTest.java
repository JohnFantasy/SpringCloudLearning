package com.laofaner.javasourcecode.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author fyz
 * @Date 2/26/2019 18:22 PM
 * @Version 1.0
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("a", "b");
        map.put("v", "");
        map.put("z", null);
        System.out.println(map.get("v") == null);

        List<Long> list = new ArrayList<>();
        list.add(902201002193426347L);
        Long a = 902201002193426347L;
        System.out.println(list.contains(a));

        System.out.println(a.equals(902201002193426347L));

        // 验证map中的value为引用类型时，若对对象进行修改，则map中的元素随之改变
        Map<String, Student> map2 = new HashMap<>();
        Student aaa = new Student("张三");
        map2.put("a", aaa);
        aaa.setName("李四");
        System.out.println(map2.toString());

    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}