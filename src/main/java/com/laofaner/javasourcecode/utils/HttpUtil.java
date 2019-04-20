package com.laofaner.javasourcecode.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 */
public class HttpUtil {
    public static String get(String url) throws Exception {
        StringBuilder result = new StringBuilder();
        try {
            URL request = new URL(url);
//            URLConnection urlConnection = request.openConnection();
            HttpURLConnection conn = (HttpURLConnection) request.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("user-agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                result.append(inputLine);
            }
            br.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new Exception(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        return result.toString();
    }

    public static String post(String url, String body) throws Exception {
        String result = null;
        BufferedReader bufferedReader = null;
        try {
            URL request = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) request.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            //有数据提交时
            if (body != null) {
                conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                OutputStream outputStream = conn.getOutputStream();
                outputStream.write(body.getBytes("UTF-8"));
                outputStream.flush();
                outputStream.close();
            }
            // 将返回的输入流转换成字符串
            bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String str;
            StringBuilder builder = new StringBuilder();
            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str);
            }
            result = builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException execption) {
                execption.printStackTrace();
            }
        }
        return result;
    }
}

