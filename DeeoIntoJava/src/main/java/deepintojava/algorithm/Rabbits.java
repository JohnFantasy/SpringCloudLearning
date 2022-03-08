package deepintojava.algorithm;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不 死，问每个月的兔子总数为多少？
 * @author: fyz
 * @create: 2019-10-18 10:40
 **/
public class Rabbits {

    public static void main(String[] args) {
        for(int i =1;i<=20;i++){
            System.out.println(f(i));
        }
    }

    public static int f(int month){
        if(month ==1 || month == 2){
            return 1;
        }else{
            return f(month-1)+ f(month -2);
        }
    }
}
