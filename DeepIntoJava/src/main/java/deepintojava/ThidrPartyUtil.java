package deepintojava;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 第三方工具学习
 * @author: fyz
 * @createAt: 2019-12-23 15:48
 **/
public class ThidrPartyUtil {

    public static void main(String[] args) {
        List arrayList = JSON.parseObject("[{\"a\":\"b\"},{}]", List.class);

        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        System.out.println(map);
        System.out.println(arrayList);
        Collections.synchronizedCollection(arrayList);
        try { 
            new Thread() {
                @Override
                public void run() {
                    while (true) {
                        Iterator iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            new Thread() {
                @Override
                public void run() {
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    arrayList.add("dddd");
                    System.out.println(arrayList);
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Thread(()->{
            for(int i =0;i<100;i++){
                System.out.println("========");
                System.out.println("xxxxxxxxxxx");
            }
        }).start();

    }
}
