package deepintojava.dailytests;

import java.util.*;

public class LongTest {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>() {
            {
                add(34L);
                add(64L);
            }
        };

        Map<String, String> map = new HashMap<String, String>() {{
            put("a", "b");
            put("c", "d");
            put("e", "f");
            put("g", "h");
        }};

        Integer numberIndexInList = LongTest.getNumberIndexInList(34L, list);
        System.out.println("the index of 34 is : " + numberIndexInList);

        int i = list.indexOf(34L);
        System.out.println(i);
        System.out.println(0x7fffffff);

    }

    public static Integer getNumberIndexInList(Long number, List<Long> list) {

        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), number)) {
                return i;
            }
        }
        return -1;
    }
}
