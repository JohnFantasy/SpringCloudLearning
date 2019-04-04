package com.laofaner.javasourcecode.othertests;

public class Main {


    /**
     * @Title 
     * @Author: fanyuzhuo
     * @CreateTime: 2019/3/31 00:05
     * @Params 
     * @Return 
     * @Description: TODO
     */
    public static void main(String[] args) {
        String str = "30\t1\t1-1\n";
        String[] strs = str.split("\n");
        StringBuilder sb = new StringBuilder("select * from t_community_house where ");
        for (String s : strs) {
            String[] strs2 = s.split("\t");
            sb.append("(floor_no = '").append(strs2[0]).append("' and unit_no = '").append(strs2[1]).append("' and house_no = '").append(strs2[2]).append("') or ");
        }
        System.out.println(sb.toString());

    }
}
