package deepintojava.clawler.gif;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class HttpClientTest {

    private static final String targetUrl = "https://cl.5252x.xyz/htm_data/2207/16/5195522.html";

    public static void main(String[] args) throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet();
        get.setURI(URI.create(targetUrl));
        get.setHeader("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.81 Safari/537.36 Edg/104.0.1293.47");
        get.setHeader("authority","developer.mozilla.org");
        get.setHeader(":method","GET");
        get.setHeader(":path","/api/v1/whoami");
        get.setHeader(":scheme","https");
        get.setHeader("accept","*/*");
        get.setHeader("accept-encoding","gzip, deflate, br");
        get.setHeader("accept-language","zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        get.setHeader("referer","https://developer.mozilla.org/en-US/docs/Web/HTTP/Status");
        get.setHeader("sec-ch-ua","\"Chromium\";v=\"104\", \" Not A;Brand\";v=\"99\", \"Microsoft Edge\";v=\"104\"");
        get.setHeader("sec-ch-ua-mobile","?0");
        get.setHeader("sec-ch-ua-platform","\"Windows\"");
        get.setHeader("sec-fetch-dest","empty");
        get.setHeader("sec-fetch-mode","cors");
        get.setHeader("sec-fetch-site","same-origin");
        HttpResponse response = client.execute(get);
        if (response != null) {
            HttpEntity entity = response.getEntity();   // 获取网页内容
            String result = EntityUtils.toString(entity, "UTF-8");
            System.out.println("网页内容：" + result);
//            return result;
        }
    }
}
