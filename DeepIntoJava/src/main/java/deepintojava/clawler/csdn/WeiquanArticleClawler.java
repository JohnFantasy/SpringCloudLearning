package deepintojava.clawler.csdn;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class WeiquanArticleClawler {
    public static void main(String[] args) throws IOException {
        String url = "https://api.fageka.net/chat/article/info/62";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建httpGet实例
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.81 Safari/537.36 Edg/104.0.1293.47");
        httpGet.setHeader("Authorization", "ai7sysx03lschusx34dze8ph6946valp");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            WeiquanArticleDTO resultObject = JSON.parseObject(result, WeiquanArticleDTO.class);
            String html = resultObject.getData().getContent();
            String markdown = CsdnArticlesClawer.convertToMarkdown(html);
            System.out.println(markdown);
        }
    }
}
