package deepintojava.javaFoundation.JavaIO;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * @author fanyuzhuo
 * @createAt 2021-07-22 15:04
 * @description
 */
public class CopyFileTest {

    public static void main(String[] args) throws Exception {

        File oldFile = new File("C:\\Users\\fanyuzhuo\\Desktop\\VisioPro2019Retail.img");
        File newFile = new File("D:\\NEWFILE.img");
        long startTime = System.currentTimeMillis();
        copyFileUsingStream(oldFile, newFile);
//        copyFileUsingChannel(oldFile,newFile);
        System.out.println("file copied, time used: " + (System.currentTimeMillis() - startTime) / 1000 + "  s");


    }


    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[16384];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    private static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } finally {
            sourceChannel.close();
            destChannel.close();
        }
    }


    private static void copyFileUsingApacheCommonsIO(File source, File dest) throws IOException {
        FileUtils.copyFile(source, dest);
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
}
