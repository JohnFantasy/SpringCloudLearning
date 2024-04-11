package deepintojava.javaFoundation.tests;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-07 17:38
 * @description
 */
public class TestTest {


    public static void main(String[] args) {
        String str = "周小红\n" +
                "柳涛\n" +
                "丁朋华\n" +
                "余沛\n" +
                "尹富民\n" +
                "刘诗洋\n" +
                "李国曦\n" +
                "何丝妍\n" +
                "周禹志\n" +
                "谭伟\n" +
                "吴兵\n" +
                "罗杨\n" +
                "杨煊\n" +
                "寇红伟\n" +
                "商波\n" +
                "伍强\n" +
                "张洋\n" +
                "华宗楠\n" +
                "高金亭\n" +
                "陶珏宇\n" +
                "周治国\n" +
                "胡陈\n" +
                "王祥宇\n" +
                "甘凌蔚\n" +
                "龚宇\n" +
                "向攀亘\n" +
                "牟里奡\n" +
                "胡滟鑫\n" +
                "刘星雨\n" +
                "鲜海山\n" +
                "李青东\n" +
                "李峰\n" +
                "王朝纲\n";
        String[] split = str.split("\n");
        StringBuilder sb = new StringBuilder("select id,name,dept_id from tb_tp_user where name in (");
        for (String s : split) {
            sb.append("'").append(s).append("',");
        }
        sb.append(")");
        System.out.println(sb);
    }


}
