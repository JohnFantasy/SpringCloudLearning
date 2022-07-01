package deepintojava.dailytests;

import java.util.Calendar;

/**
 * @Author fyz
 * @Date 2022/6/9 10:42
 * @Description TODO
 **/
public class WeekOfYearTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(i);
        Thread thread = new Thread(()->{
            System.out.println("this is a thread ,whose name is :" + Thread.currentThread().getName());
        });
        thread.start();
    }
}
