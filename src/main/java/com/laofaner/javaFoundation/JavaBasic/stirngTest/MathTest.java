package com.laofaner.javaFoundation.JavaBasic.stirngTest;

/**
 * @author fanyuzhuo
 * @createAt 2021-09-21 15:59
 * @description
 */
public class MathTest {

    public static void main(String[] args) {
        for(int i =1;i<Integer.MAX_VALUE;i++){
            for(int j =1;j<Integer.MAX_VALUE;j++){
                if((1/i)+(1/j)==(3/17)){
                    System.out.println("i is :"+i);
                    System.out.println("j is :"+j);
                    break;
                }
            }
        }
    }
}
