package com.laofaner.springboot.domain.entity;

import java.util.Date;

public class BillEntity {
    private String billNo;

    private Double billAmount;

    private String orderNo;

    private Date createTime;

    private Date updateTime;

    public BillEntity(String billNo, Double billAmount, String orderNo, Date createTime, Date updateTime) {
        this.billNo = billNo;
        this.billAmount = billAmount;
        this.orderNo = orderNo;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public BillEntity() {
        super();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}