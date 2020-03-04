package com.laofaner.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.laofaner.javaFoundation.JavaIO.ReadingAndWriteStringToFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

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

    public static void main(String[] args) {
        String baseUrl = "https://api.weixin.qq.com/cgi-bin/user/get?access_token" +
                "=31_r3jR3-lB3OitmgWxTUhRhgXP1Dlt3xCMfUx6Jr1ZN-WZf3VJxQEcLRDr2O7VU_nmwYIIozmPUDLRqnjhbCzLpibB8VcG9llcV8izof8dWBFlsskcq9SViCn5jAsWZbX8QaRa-wJsgBFuBAu5DOSeAGALWA&next_openid=";
        String next_openid = "";
        int count = 10000;
        while (count == 10000) {
            try {
                JSONObject result = JSON.parseObject(HttpUtil.get(baseUrl + next_openid));
                int total = (int) result.get("total");
                JSONObject data = (JSONObject) result.get("data");
                JSONArray openid = (JSONArray) data.get("openid");
                Iterator<Object> iterator = openid.iterator();
                StringBuilder openidList = new StringBuilder("");
                while (iterator.hasNext()) {
                    openidList.append(iterator.next().toString()).append(",\n");
                }


                ReadingAndWriteStringToFile.appendContent("C:\\Users\\laofa\\Desktop\\test", openidList.toString());
                next_openid = (String) result.get("next_openid");
                System.out.println(next_openid);
                count = (int) result.get("count");
            } catch (Exception e) {
                count = 1;
                e.printStackTrace();
            }
        }

    }
}

