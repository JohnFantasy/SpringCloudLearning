package com.laofaner.javasourcecode.JavaBasic;

public class FinallyTest {

    public static void main(String[] args) {
        String a = "111";
        FinallyTest finallyTest = new FinallyTest();
        String result = finallyTest.finallyTest(a);
        System.out.println(result);

    }

    public String finallyTest(String str) {
        try {
            str += "666";
//            throw new RuntimeException("就是要报错");
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            str = "888";
        }
        return str;
    }
}
