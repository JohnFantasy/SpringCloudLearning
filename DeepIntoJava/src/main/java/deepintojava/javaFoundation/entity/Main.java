package deepintojava.javaFoundation.entity;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        DepositAccountEntity depositAccountEntity = new DepositAccountEntity();
        depositAccountEntity.setBalance(new BigDecimal(71.00));
        depositAccountEntity.setHouseId("123freg");
        System.out.println(depositAccountEntity.getHouseId() != null && depositAccountEntity.getBalance().compareTo(new BigDecimal("0")) > 0);
    }
}
