package deepintojava.javaFoundation.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DataExportTests
 * @Description TODO
 * @Author fyz
 * @Date 3/4/2019 16:31 PM
 * @Version 1.0
 */
public class DataExportTests {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        String str = "6A2B27C397EE7323E0534A08A40A3487\n" +
                "6A322E45F472DAAFE0534B08A40A83E5\n" +
                "6A322E45F472DAAFE0534B08A40A83E5\n" +
                "6A322E45F472DAAFE0534B08A40A83E5\n";

        Map<String, String> map = new HashMap<>();

        String str2 = "6A2F54C0799A1EA7E0534A08A40A6FEC\to4vbmwpMM9BqJbRInXNJMj_1GfXM\n" +
                "6A301075D8471EA5E0534A08A40A111B\to4vbmwlrUQTaemHBD0Hiri-HFzGg\n" +
                "837C7DAFDD5F8870E0534A08A40AFFE6\to4vbmwsii9Inoumi2oL0TqChAEmU\n";
        String[] strs = str2.split("\n");
        for (String s : strs) {
            String[] strings = s.split("\t");
            String key = strings[0];
            String value = strings[1];
            map.put(key, value);
        }
        String[] strs2 = str.split("\n");
        System.out.println(strs2.length);
        System.out.println(map.size());
        for (String s : strs2) {

            System.out.println(map.get(s));
        }
    }
}
