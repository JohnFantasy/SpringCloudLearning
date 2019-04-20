package com.laofaner.javasourcecode.opensourcetools.easyexcel;

import com.alibaba.excel.metadata.BaseRowModel;

/**
 * Created by cm on 2017/9/28.
 */
public class TestChild extends BaseRowModel {

    private String communityName;
    private String floorNo;
    private String unitNo;
    private String houseNo;
    private String projectName;
    private String billName;
    private String amountStr;
    private String payTerm;
    private String description;
    private String errorInfo;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {return false;}
        if (this == obj) {return true;}
        if (obj instanceof TestChild) {
            TestChild TestChild = (TestChild) obj;
            if (TestChild.communityName.equals(this.communityName) && TestChild.floorNo.equals(this.floorNo)
                    && TestChild.unitNo.equals(this.unitNo) && TestChild.houseNo.equals(this.houseNo)
                    && TestChild.projectName.equals(this.projectName) && TestChild.billName.equals(this.billName)
                    && TestChild.payTerm.equals(this.payTerm))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return communityName.hashCode() * floorNo.hashCode() * unitNo.hashCode() * houseNo.hashCode() * projectName.hashCode() * billName.hashCode() * payTerm.hashCode();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getAmountStr() {
        return amountStr;
    }

    public void setAmountStr(String amountStr) {
        this.amountStr = amountStr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getPayTerm() {
        return payTerm;
    }

    public void setPayTerm(String payTerm) {
        this.payTerm = payTerm;
    }

    @Override
    public String toString() {
        return "TestChild{" +
                "communityName='" + communityName + '\'' +
                ", floorNo='" + floorNo + '\'' +
                ", unitNo='" + unitNo + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", projectName='" + projectName + '\'' +
                ", billName='" + billName + '\'' +
                ", amountStr='" + amountStr + '\'' +
                ", payTerm='" + payTerm + '\'' +
                ", description='" + description + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                '}';
    }
}
