package deepintojava.clawler.gif;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DownloadPic {

    public void downloadPic(String url, String filePath, String folderName) throws IOException {

        try {
            filePath = filePath.replace("{}", folderName);
            File path = new File(filePath);
            if (!path.exists()) {
                path.mkdir();
            }
            if (!url.contains("http")) {
                url = url.replace("http", "https");
            }
            url = url.replace("'", "");
            String imageName = url.substring(url.lastIndexOf("/") + 1, url.length());
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet get = new HttpGet(url);
            get.setHeader("User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0");
            get.setHeader("accept", "*/*");
            get.setHeader("accept-encoding", "gzip, deflate, br");
            CloseableHttpResponse response = client.execute(get);
            InputStream in = response.getEntity().getContent();

            FileOutputStream fo = new FileOutputStream(new File(filePath + imageName));
            byte[] buf = new byte[1024];
            int length = 0;
            System.out.println("开始下载:" + url);
            while ((length = in.read(buf, 0, buf.length)) != -1) {
                fo.write(buf, 0, length);
            }
            in.close();
            fo.close();
            System.out.println(imageName + "下载完成");
        } catch (Exception e) {
            System.out.println("下载失败");
        }
    }
}