package deepintojava.javaFoundation.othertests;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.javasourcecode.othertests
 * @Author: fanyuzhuo
 * @CreateTime: 2019-05-19 14:57
 * @Description: TODO
 * @Version 1.0
 */
public class WeeklyReportTests {

    public static void main(String[] args) {
        String time = "\"08:52\n" +
                "20:12\"\t\"08:56\n" +
                "18:15\"\t\"08:57\n" +
                "18:11\"\t\"08:56\n" +
                "21:50\"\t\"08:50\n" +
                "18:05\"\t\"08:58\n" +
                "21:10\"\t\"08:55\n" +
                "18:09\"\t\"08:53\n" +
                "18:11\"\t\"08:54\n" +
                "22:13\"\t\"08:52\n" +
                "18:08\"\t\"08:54\n" +
                "20:42\"\t\"08:52\n" +
                "18:11\"\t\"08:52\n" +
                "18:08\"\t\"08:51\n" +
                "21:33\"\t\"08:56\n" +
                "18:11\"\t\"08:54\n" +
                "19:35\"\t\"08:54\n" +
                "19:40\"\t\"08:53\n" +
                "18:12\"\t\"08:54\n" +
                "22:08\"\t\"08:53\n" +
                "18:06\"\n";
        String[] onOff = time.split("\"\t\"");
        List<String> list = new ArrayList<>();
        for (int i=0;i<onOff.length;i++) {
//            System.out.println(s);
            String[] ss = onOff[i].split("\n");
//            list.add("第"+(i+1)+"天\t"+ss[0].replace("\"", "") + "-" + ss[1].replace("\"", ""));
            System.out.println("第"+(i+1)+"天\t"+ss[0].replace("\"", "") + "-" + ss[1].replace("\"", ""));
        }


    }
}
