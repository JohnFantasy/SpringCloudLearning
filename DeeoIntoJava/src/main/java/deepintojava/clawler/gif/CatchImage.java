package deepintojava.clawler.gif;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * java抓取网络图片
 * @author swinglife
 *
 */
public class CatchImage {

    // 地址
    private static final String URL = "https://.xyz/htm_data/2207/7/5196261.html";
    // 编码
    private static final String ECODING = "UTF-8";
    // 获取img标签正则
    private static final String IMGURL_REG = "<img.*ess-data.*>";
    // 获取src路径的正则
    private static final String IMGSRC_REG = "http[s]{0}\"?(.*?)(\"|>|\\s+)";


    public static void main(String[] args) throws Exception {
        CatchImage cm = new CatchImage();
        //获得html文本内容
        String HTML = cm.getHTML(URL);
        //获取图片标签
        List<String> imgUrl = cm.getImageUrl(HTML);
        //获取图片src地址
        List<String> imgSrc = cm.getImageSrc(imgUrl);
        //下载图片
        cm.Download(imgSrc);

    }


    /***
     * 获取HTML内容
     *
     * @param url
     * @return
     * @throws Exception
     */
    protected String getHTML(String url) throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建httpGet实例
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.81 Safari/537.36 Edg/104.0.1293.47");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if (response != null) {
            HttpEntity entity = response.getEntity();   // 获取网页内容
            String result = EntityUtils.toString(entity, "UTF-8");
            System.out.println("网页内容：" + result);
            return result;
        }
        if (response != null) {
            response.close();
        }
        if (httpClient != null) {
            httpClient.close();
        }
        return null;
    }

    /***
     * 获取ImageUrl地址
     *
     * @param HTML
     * @return
     */
    protected List<String> getImageUrl(String HTML) {
        Matcher matcher = Pattern.compile(IMGURL_REG).matcher(HTML);
        List<String> listImgUrl = new ArrayList<String>();
        while (matcher.find()) {
            listImgUrl.add(matcher.group());
        }
        return listImgUrl;
    }

    /***
     * 获取ImageSrc地址
     *
     * @param listImageUrl
     * @return
     */
    protected List<String> getImageSrc(List<String> listImageUrl) {
        List<String> listImgSrc = new ArrayList<String>();
        for (String image : listImageUrl) {
            Matcher matcher = Pattern.compile(IMGSRC_REG).matcher(image);
            while (matcher.find()) {
                String substring = matcher.group().substring(0, matcher.group().length() - 1);
                if (substring.length() > "http://a.d/adblo_ck.jpg'".length()) {
                    listImgSrc.add(substring);
                }
            }
        }
        return listImgSrc;
    }

    /***
     * 下载图片
     *
     * @param listImgSrc
     */
    private void Download(List<String> listImgSrc) {
        try {
            String filePath = "C:\\Users\\fyz\\Desktop\\jpgs\\";
            filePath = filePath + getRandomString()+"\\";
            File path = new File(filePath);
            if (!path.exists()) {
                path.mkdir();
            }
            for (String url : listImgSrc) {
                if (!url.contains("http")) {
                    url = url.replace("http", "https");
                }
                url = url.replace("'", "");
                String imageName = url.substring(url.lastIndexOf("/") + 1, url.length());
//                URL uri = new URL(url);
//                InputStream in = uri.openStream();
                CloseableHttpClient client = HttpClients.createDefault();
                HttpGet get = new HttpGet(url);
                get.setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.81 Safari/537.36 Edg/104.0.1293.47");
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
            }
        } catch (Exception e) {
            System.out.println("下载失败");
        }
    }

    public static String getRandomString() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}