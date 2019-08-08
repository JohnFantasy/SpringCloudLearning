package com.laofaner.javaFoundation.JavaBasic;

/**
 * @ClassName PriorityOfOperations
 * @Description TODO
 * @Author fyz
 * @Date 2/21/2019 11:09 AM
 * @Version 1.0
 */
public class PriorityOfOperations {

    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int z = 9;
//        System.out.println(y+=z--/++x);
//        System.out.println(y+=(z--/++x));
//        System.out.println(9/8);
//        System.out.println(8/9);

//        System.out.println(z--/++x);

        String s0= "dooffe";
        String s1=new String("dooffe");
        System.out.println( s0==s1 );
        s1.intern();
        System.out.println( s0==s1);
        System.out.println( s0==s1.intern() );


    }
}
