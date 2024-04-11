package deepintojava.javaFoundation.StringUtil;

import java.io.*;

/*
a util class to convert some ddls to a chart
 */
public class ConvertDllToChart {

    public static void main(String[] args) {
        try {
            ConvertDllToChart convertDdlToChart = new ConvertDllToChart();
            String ddl = convertDdlToChart.fileRead();
            String[] ddls = ddl.split("create table");
            for (String table : ddls) {
//                table = "create table" + table;
                //处理DDL信息
                if (table.length() > 5) {
                    String tableName = table.substring(0, table.indexOf("(")).trim();
//                    System.out.println("tableName is =====" + tableName);
                    String singlDdl;
                    if (table.contains("comment on")) {
                        singlDdl = table.substring(0, table.indexOf("/"));
//                        System.out.println("singleDdl is ========------" + singlDdl);
                    }

                }
//                System.out.println("0000000000000000000000");
                // 处理注释信息
                if (table.contains("comment on")) {
                    String comments = table.substring(table.indexOf("comment on"));
                    String[] commentList = comments.split("/");
                    for (String comment : commentList) {
//                        System.out.println("comment is -----" + comment);
                        if (comment != null && comment.trim().length() > 1) {

                            comment = comment.trim();
                            if (comment.startsWith("comment on table")) {
                                System.out.println(comment.substring(17, comment.indexOf(" is")) + "\t" +
                                        comment.substring(comment.indexOf("'") + 1, comment.length()-1));
                            }
                        }
                    }
                }
//                System.out.println("--------++++++++++++++++++**************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    private String fileRead() throws Exception {
        File file = new File("C:\\Users\\laofa\\Desktop\\community_ddl.sql");//定义一个file对象，用来初始化FileReader
        FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
        BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
        StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
        String s = "";
        while ((s = bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
//            System.out.println(s);
        }
        bReader.close();
        String str = sb.toString();
//        System.out.println(str);
        return str;
    }
}
