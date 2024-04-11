package deepintojava.clawler.csdn;

import lombok.Data;

@Data
public class ArticleData {
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String remark;

    private String id;
    private String content;
}
