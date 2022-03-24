package deepintojava.javaFoundation.tests.controller;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * JAVA 返回随机数，并根据概率、比率
 *
 * @author zhanglei
 */
public class MathRandom {


    /**
     * 测试主程序
     *
     * @param agrs
     */
    public static void main(String[] agrs) {

        //java.lang.Math.random() 返回一个正符号的double值，大于或等于0.0且小于1.0
        MathRandom redpacketGenerator = new MathRandom();

        Math.max(1,2);

        Map<String, String> redpacketRules = new HashMap<>();

        redpacketRules.put("1.88", "25000");
        redpacketRules.put("3.88", "21500");
        redpacketRules.put("5.88", "1500");
        redpacketRules.put("8.88", "1000");
        redpacketRules.put("11.88", "500");
        redpacketRules.put("22.88", "100");
        redpacketRules.put("33.88", "100");
        redpacketRules.put("68.88", "100");
        redpacketRules.put("88.88", "100");
        redpacketRules.put("100", "100");

        Map<String, String> redpacketRules1 = new HashMap<>();

        redpacketRules1.put("1.88", "50000");
        redpacketRules1.put("3.88", "43000");
        redpacketRules1.put("5.88", "3000");
        redpacketRules1.put("8.88", "2000");
        redpacketRules1.put("11.88", "1000");
        redpacketRules1.put("22.88", "200");
        redpacketRules1.put("33.88", "200");
        redpacketRules1.put("88.88", "200");
        redpacketRules1.put("168.88", "200");
        redpacketRules1.put("200", "200");

        int totalAmount = 50000;
        int startNum = 2500;
        String actId = "2";


        int totalAmount1 = 100000;
        int startNum1 = 52500;
        String actId1 = "3";

//        redpacketGenerator.percentageRandom(totalAmount, redpacketRules, startNum, actId);
        redpacketGenerator.percentageRandom(totalAmount1, redpacketRules1, startNum1, actId1);
//        System.out.println(result);
    }

    /**
     * @Author fyz
     * @Params totalAmount--红包总个数；Map<String,String> redpackRules--key为金额，value为个数
     * @Description: ${todo}
     * @Date 2019/01/16 11:12 AM
     */
    private String percentageRandom(int totalAmount, Map<String, String> redpackRules, int startNum, String actId) {

        // 校验参数是否为空
        if (totalAmount < 0 || null == redpackRules || redpackRules.isEmpty()) {
            return "参数不合法";
        }

        //校验参数中的总个数是否等于所有单项红包个数之和
        Collection<String> amounts = redpackRules.values();
        int totalAmount1 = 0;
        for (String amount : amounts) {
            totalAmount1 += Integer.valueOf(amount);
        }
        System.out.println(totalAmount1);
        if (totalAmount != totalAmount1) {
            return "参数有误";
        }
        //遍历规则列表，生成红包
        List<String> list = new ArrayList<>();
        Set<Map.Entry<String, String>> entry = redpackRules.entrySet();
        for (Map.Entry<String, String> keyVlues : entry) {
            BigDecimal singleAmount = new BigDecimal(keyVlues.getKey());
            int singleRedpackQuantity = Integer.valueOf(keyVlues.getValue());
            int percentage = singleRedpackQuantity * 1000 / totalAmount;
            System.out.println(keyVlues);
            for (int i = 0; i < singleRedpackQuantity; i++) {
                list.add("INSERT INTO T_COMMUNITY_REDENVOLOPE VALUES (" + i + "," + percentage + "," + singleAmount + "," + singleRedpackQuantity + ",'0','" + actId + "',SYSDATE,SYSDATE);\n");
            }
        }
        Collections.shuffle(list);
        File file = new File("D:\\test.sql");
        FileWriter ps = null;
        try {
            ps = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = startNum; i < list.size() + startNum; i++) {
            String str = list.get(i - startNum);
            str = str.replaceAll("\\(\\d+,", "\\(" + String.valueOf(i) + ",");
            try {
                ps.write(str);
                if(i%500 == 499){
                    ps.write("COMMIT;\n");
                }
                ps.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
