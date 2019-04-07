package com.laofaner.springboot.domain.entity;

import java.util.Date;

public class OrderEntity {
    private String orderNo;

    private Double orderAmount;

    private String userId;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public OrderEntity(String orderNo, Double orderAmount, String userId, Integer status, Date createTime, Date updateTime) {
        this.orderNo = orderNo;
        this.orderAmount = orderAmount;
        this.userId = userId;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OrderEntity() {
        super();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "OrderEntity{" +
                "orderNo='" + orderNo + '\'' +
                ", orderAmount=" + orderAmount +
                ", userId='" + userId + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}