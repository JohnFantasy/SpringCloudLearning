package com.laofaner.javasourcecode.JavaIO;

import java.io.File;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.javasourcecode.JavaIO
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-08 11:25
 * @Description: 批量重命名某目录下文件名称
 * @Version 1.0
 */
public class RenameFiles {
    public static void main(String[] args) {
        File file = new File("F:\\OneDrive\\Work\\1-Dooffe\\项目管理相关文档\\农行工作汇报\\补填4个人工作周报\\潘荣才");
        File[] files = file.listFiles();
        for(File childFile : files){
            String oldName = childFile.getName();
            System.out.println(oldName);
            childFile.renameTo(new File("F:\\OneDrive\\Work\\1-Dooffe\\项目管理相关文档\\农行工作汇报\\补填4个人工作周报\\潘荣才\\"+oldName.replace("刘涛","潘荣才")));
        }
        System.out.println("finished");
    }
}
