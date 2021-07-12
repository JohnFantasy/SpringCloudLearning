package com.laofaner.utils;

/**
 * @author fanyuzhuo
 * @createAt 2021-04-20 19:08
 * @description
 */
public class Word2ExcelTest {

    public static void main(String[] args) {
        String excel = "1.新文化运动的两大口号是________。A\t民主和科学\t新道德和新文学\t民权和平等\t\n";

        String[] split = excel.split("\n");
        for (String s : split) {
//            System.out.println(s);
            String[] split1 = s.split("\t");
//            for(int i=0;i<split1.length;i++){
            String title = split1[0].substring((split1[0].indexOf(".") + 1), split1[0].lastIndexOf("。"));
            String a = split1[1];
            String b = split1[2];
            String c = split1[3];
            String answer = split1[0].substring(split1[0].lastIndexOf("。") + 1);
            System.out.println(title + "。\t" + a + "\t" + b + "\t" + c + "\t" + answer);
//            }
        }
    }
}