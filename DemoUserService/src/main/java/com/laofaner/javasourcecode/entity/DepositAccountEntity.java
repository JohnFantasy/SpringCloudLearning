package com.laofaner.javasourcecode.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DepositAccountEntity {
    private String houseId;

    private BigDecimal balance;

    private Short status;

    private Date createDate;

    private Date lastUpdateDate;

    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "DepositAccountEntity{" +
                "houseId='" + houseId + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                ", createDate=" + createDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
