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
        Map<String,Object> map = new HashMap<>();
        map.put("a","b");
        map.put("v","");
        map.put("z",null);
        System.out.println(map.get("v") == null);

        List<Long> list = new ArrayList<>();
        list.add(902201002193426347L);
        Long a = 902201002193426347L;
        System.out.println(list.contains(a));

        System.out.println(a.equals(902201002193426347L));

    }
}
