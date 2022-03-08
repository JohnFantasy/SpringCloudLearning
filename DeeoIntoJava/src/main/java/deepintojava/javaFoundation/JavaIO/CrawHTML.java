package deepintojava.javaFoundation.JavaIO;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 抓取网页html
 * @author: fyz
 * @create: 2019-08-30 23:58
 **/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class CrawHTML {
    /**
     * Use for check our website is work well.
     *
     * @return
     */

    public static void main(String[] args) {
        String html = CrawHTML.checkWebsite("https://www.ithome.com/");
        System.out.println(html);
    }

    private static String checkWebsite(String checkUrl) {
        try {
            URL url = new URL(checkUrl);
            HttpsURLConnection httpsConn = (HttpsURLConnection) url.openConnection();
            //取得该连接的输入流，以读取响应内容
            InputStream ins = httpsConn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
            StringBuilder sb = new StringBuilder();
            long nowTime = new java.util.Date().getTime();
            while (reader.readLine() != null) {
                String info = reader.readLine();
                System.out.println(info);
                if (new java.util.Date().getTime() - nowTime > 10000) {
                    return "time out";
                }//达到10秒就认为超时
                sb.append(info);
            }
            return sb.toString();
        } catch (Exception e) {
            System.out.println("The error is:" + e.getMessage());
            e.printStackTrace();
            return "false";
        }
    }
}