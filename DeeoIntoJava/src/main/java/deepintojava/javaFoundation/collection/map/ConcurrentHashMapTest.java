package deepintojava.javaFoundation.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: SpringBoot&SpringCloud
 * @description: ConcurrentHashMapTest学习类
 * @author: fyz
 * @create: 2019-09-29 10:05
 **/
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        Map originalMap = new HashMap();
        originalMap.put("key1", "value1");
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.putAll(originalMap);

    }
}
