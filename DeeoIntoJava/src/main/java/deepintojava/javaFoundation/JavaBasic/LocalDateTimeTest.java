package deepintojava.javaFoundation.JavaBasic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @program: SpringBoot&SpringCloud
 * @description: LocalDateTime API学习  四个小姨子两个大妹妹两个小弟弟
 * @author: fyz
 * @create: 2019-10-21 09:55
 **/
public class LocalDateTimeTest {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        getDate();
        System.out.println(format(getDate()));
        System.out.println(parse("2008-08-08 20:08:08"));
    }

    public static LocalDateTime getDate() {
        return LocalDateTime.now();
    }

    public static String format(LocalDateTime time) {

        if (time == null) {
            return null;
        }
        return formatter.format(time);
    }

    public static LocalDateTime parse(String timeString){
       return LocalDateTime.parse(timeString,formatter);
    }
}
