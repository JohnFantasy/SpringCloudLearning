package deepintojava.javaFoundation.JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DateTest {

    public static void main(String[] args) {
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("2021-11-01", 10000);
        dataMap.put("2021-11-02", 10001);
        dataMap.put("2021-11-03", 10002);
        dataMap.put("2021-11-04", 10003);
        dataMap.put("2021-11-05", 10004);
        dataMap.put("2021-11-06", 10005);
        dataMap.put("2021-11-07", 10006);
        dataMap.put("2021-11-08", 10007);
        dataMap.put("2021-11-09", 10008);
        dataMap.put("2021-11-10", 10009);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String parse = sdf.format(calendar.getTime());
        Integer integer = dataMap.get(parse);
        System.out.println(integer);

        long startTime = System.currentTimeMillis();
//        String uuid1 = UUID.randomUUID().toString().replace("-", "");
//        System.out.println("method 1 get UUID cost time :"+(System.currentTimeMillis()-startTime));
        String[] uuidrray = UUID.randomUUID().toString().split("-");
        String uuid2 = uuidrray[0] + uuidrray[1] + uuidrray[2] + uuidrray[3];
        System.out.println("method 1 get UUID cost time :" + (System.currentTimeMillis() - startTime));
    }
}


