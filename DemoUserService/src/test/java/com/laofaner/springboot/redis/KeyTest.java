package com.laofaner.springboot.redis;

import com.laofaner.springboot.util.RedisKeyHandleUtil;

import java.util.BitSet;

public class KeyTest {

    public static void main(String[] args) {
        String c0 = RedisKeyHandleUtil.hex2bin("e0");
        System.out.println(c0);

    }


}
