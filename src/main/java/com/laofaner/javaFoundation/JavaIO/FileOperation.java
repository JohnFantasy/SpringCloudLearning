package com.laofaner.javaFoundation.JavaIO;

import javax.validation.constraints.Max;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 删除oneDrive重复文件
 * @author: fyz
 * @create: 2019-11-01 14:20
 **/
public class FileOperation {

    public static void main(String[] args) {
        File file = new File("F:\\OneDrive\\Pictures\\本机照片");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            System.out.println(files.length);
            List<File> files1 = Arrays.asList(files);
            List<File> files2 = Arrays.asList(files);
            List<File> filesToBeDeleted = new ArrayList<>();
            for (File file2 : files1) {
                for (File file3 : files2) {
                    if ((file2.getName().substring(0, file2.getName().indexOf(".")))
                            .equals(file3.getName().substring(0, file3.getName().indexOf(".")) + " 1")) {
                        filesToBeDeleted.add(file2);
                    }
                }
            }
            System.out.println(filesToBeDeleted.size());
            for(File filex : filesToBeDeleted){
                System.out.println("file to be deleted--->"+filex.getName());
                filex.delete();
            }
//            for (File file1 : files) {
//                System.out.println(file1.getName());
//
//            }
        }
    }
}
