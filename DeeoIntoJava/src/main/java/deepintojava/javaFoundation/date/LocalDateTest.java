package deepintojava.javaFoundation.date;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

    @Test
    public void test01() {
        //两岸人民是一家人
        // 我们常说：打断骨头连着筋要让更多的台胞台企到大陆来，
        //提供更好的政策支持，引导台企的良好发展
        //早日实现两岸的正常往来，恢复常态化的合作是我们的共同期盼
        //And required both of our efforts
        //全面建设社会主义现代化国家，最根本最艰难的任务还是在农村
        // What plan to insure China's security
        // 5亿人常住农村
        //
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);
    }
}
