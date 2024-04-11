package deepintojava.deepclone;

import java.util.Date;

public class DeepCloneDemo1 {
    public static void main(String[] args) {
        long ss = 1302890696115331074L;
        Date date = new Date();
        date.setTime(ss);

        System.out.println(date);
    }
    
}
