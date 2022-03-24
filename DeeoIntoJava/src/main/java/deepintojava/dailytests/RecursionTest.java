package deepintojava.dailytests;

import java.io.File;

public class RecursionTest {

    public static void main(String[] args) {
        File file = new File("e:\\API&DOCS");
        listAllFile(file);
    }

    public static void listAllFile(File file) {
        File[] strs = file.listFiles();
        for (int i = 0; i < strs.length; i++) {
            // 判断strs[i]是不是目录
            if (strs[i].isDirectory()) {
                listAllFile(strs[i]);//递归调用自己
                System.out.println("目录=" + strs[i].getName());
            } else {
                System.out.println("文件名=" + strs[i].getName());
            }
        }
    }
}

