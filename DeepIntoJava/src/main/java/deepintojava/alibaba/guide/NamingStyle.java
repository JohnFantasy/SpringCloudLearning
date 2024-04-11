package deepintojava.alibaba.guide;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class NamingStyle {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.代码中的命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束。
        //反例：_name / __name / $name / name_ / name$ / name__
        String name_ = "zhangsan";
        String _name_ = "zhangsan";
        String __name_ = "zhangsan";
        String $name_ = "zhangsan";
        String name$= "zhangsan";
        //2. there should not be pinyin in any name of methods or classes or variables
        String stfdsvfs = URLEncoder.encode("stfdsvfs", "utf-8");

    }
}
