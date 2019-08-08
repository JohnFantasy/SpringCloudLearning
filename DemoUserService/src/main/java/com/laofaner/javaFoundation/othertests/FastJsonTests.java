package com.laofaner.javaFoundation.othertests;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.javasourcecode.othertests
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-18 15:52
 * @Description: TODO
 * @Version 1.0
 */
public class FastJsonTests {

    public static void main(String[] args) {

        List<TestEntity> list  = new ArrayList<>();
        list.add(null);
        System.out.println(JSONObject.toJSONString(list));
    }
}
