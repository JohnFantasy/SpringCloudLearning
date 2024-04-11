package deepintojava.xiyue;

import com.carrotsearch.sizeof.RamUsageEstimator;

import java.util.ArrayList;

public class Solution {
    //第四题
    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap the two int
                    int swap = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
    public static void main(String[] args){
        int [] arr = {23,43,12,54,32,56,121,58,25,65,53,56,47,98};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j);
            System.out.print(",");
        }
        System.out.println("=====================");

        //arraylist
        //第10题
        ArrayList<String> aList = new ArrayList<>();
        aList.add("Hello");
        aList.add("Hello");
        aList.add("World");
        aList.add("Hello");
        aList.add("Hello");
        aList.add("China");
        aList.add("Hello");
        aList.add("Hello");
        aList.add("Canada");
        boolean con = aList.contains("Hello");
        System.out.println(con);
        for (int i = 0; i < aList.size(); i++) {
            if("Hello".equals(aList.get(i))){
                aList.remove(i);
            };
        }
        System.out.println(aList);


        long start = Runtime.getRuntime().freeMemory();
        boolean bo = true;
        long end = Runtime.getRuntime().freeMemory();
        System.out.println(start );
        System.out.println( end );

        int a = 5;
        System.out.println(RamUsageEstimator.sizeOf(a));
        long l = 4L;
        System.out.println(RamUsageEstimator.sizeOf(l));

        boolean[] bArr = {true,false,true,false,true,false,false,true,
                          false,true,false,false,true,false,true,false,
                          false,true,false,true,false,false,true,false,
                          false,false,true,false,true,false,true,false};
        System.out.println(RamUsageEstimator.sizeOf(bArr));

        System.out.println( RamUsageEstimator.sizeOf(bo));
    }
}
