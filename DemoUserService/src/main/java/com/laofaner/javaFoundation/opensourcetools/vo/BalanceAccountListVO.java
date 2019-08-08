package com.laofaner.javaFoundation.opensourcetools.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class BalanceAccountListVO {
    private String id;

    private String floorNo;

    private String unitNo;

    private String houseNo;

    private String residentName;

    private Short payMode;

    private String payer;

    private Date payTime;

    private BigDecimal amount;

    private BigDecimal reductionAmount;

    private BigDecimal actualPayAmount;

    private String type;

    private List<BalanceAccountListsVO> balanceAccountListsVO;
    private List<BalanceAccountListsVO> list;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<BalanceAccountListsVO> getBalanceAccountListsVO() {
        return balanceAccountListsVO;
    }

    public void setBalanceAccountListsVO(List<BalanceAccountListsVO> balanceAccountListsVO) {
        this.balanceAccountListsVO = balanceAccountListsVO;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getActualPayAmount() {
        return actualPayAmount;
    }

    public void setActualPayAmount(BigDecimal actualPayAmount) {
        this.actualPayAmount = actualPayAmount;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public Short getPayMode() {
        return payMode;
    }

    public void setPayMode(Short payMode) {
        this.payMode = payMode;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public List<BalanceAccountListsVO> getList() {
        return list;
    }

    public void setList(List<BalanceAccountListsVO> list) {
        this.list = list;
    }


}
