package deepintojava.javaFoundation.JavaBasic;

import java.math.BigDecimal;

/**
 * @ClassName BigDecimalTest
 * @Description TODO
 * @Author fyz
 * @Date 3/13/2019 10:01 AM
 * @Version 1.0
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("0");
        BigDecimal area = new BigDecimal("77.86");
        try {
            amount = area.multiply(new BigDecimal("0.01")).setScale(2, BigDecimal.ROUND_HALF_UP);
            Tests tests = new Tests();
            // 获取小区费率
            BigDecimal rates = new BigDecimal(tests.getName());
            if (rates != null && rates.doubleValue() > 0) {
                amount = amount.multiply(rates.setScale(2, BigDecimal.ROUND_HALF_UP)).setScale(2, BigDecimal.ROUND_HALF_UP);
            }
        } catch (Exception e) {

        }
        System.out.println(amount);
    }
}

class Tests {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
