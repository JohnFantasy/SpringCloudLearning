package deepintojava.clawler.csdn;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CsdnArticlesClawer {
    public static void main(String[] args) {
        String url = "https://blog.csdn.net/weixin_51921447/article/details/129146270";
        String articleHtml = CsdnArticlesClawer.getArticleHtml(url);
        String markdown = CsdnArticlesClawer.convertToMarkdown(articleHtml);
        System.out.println(markdown);
    }

    private static boolean elementsNotEmpty(Elements elements) {
        return elements != null && elements.hasText();
    }

    private static String getArticleHtml(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element mainBox = doc.getElementById("mainBox");
            if (mainBox == null) {
                mainBox = doc.getElementById("htmledit_views");
            }
            String htmlContent = mainBox.getElementById("content_views").html();
            doc = Jsoup.parse(htmlContent);
            Elements elements = doc.getElementsByTag("pre");
            if (elementsNotEmpty(elements)) {
                Elements preNumbers = null;
                for (Element element : elements) {
                    preNumbers = element.getElementsByClass("pre-numbering");
                    if (elementsNotEmpty(preNumbers)) {
                        for (Element preNumber : preNumbers) {
                            // 删换行号
                            preNumber.remove();
                        }
                    }
                }
            }
            return doc.html();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String convertToMarkdown(String html) {
        // 创建一个转换器
        FlexmarkHtmlConverter converter = FlexmarkHtmlConverter.builder().build();
        // 转换为Markdown并返回
        return converter.convert(html);
    }

    private static void writeMarkdownToFile(String markdown, String filePath) {

    }
}
