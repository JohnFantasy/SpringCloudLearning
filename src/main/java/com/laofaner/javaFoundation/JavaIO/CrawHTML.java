package com.laofaner.javaFoundation.JavaIO;

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
        CrawHTML crawHTML = new CrawHTML();
        crawHTML.checkWebsite("https://www.baidu.com", "");
    }

    public boolean checkWebsite(String checkUrl, String checkContent) {
        try {
            URL url = new URL(checkUrl);
            HttpsURLConnection httpsConn = (HttpsURLConnection) url.openConnection();
            //取得该连接的输入流，以读取响应内容
            InputStream ins = httpsConn.getInputStream();
            BufferedReader breader = new BufferedReader(new InputStreamReader(ins));
            String info = breader.readLine();
            long nowTime = new java.util.Date().getTime();
            while (info != null) {
                if (new java.util.Date().getTime() - nowTime > 10000)
                    return false;//达到10秒就认为超时
                if (info != null && info.indexOf(checkContent) != -1)
                    return true;
                info = breader.readLine();
                System.out.println(info);
            }
        } catch (Exception e) {
            System.out.println("Can't get content:" + checkContent + " from URL:" + checkUrl);
            System.out.println("The error is:" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return false;
    }
}