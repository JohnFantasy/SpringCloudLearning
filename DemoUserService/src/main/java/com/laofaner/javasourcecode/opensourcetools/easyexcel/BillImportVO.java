package com.laofaner.javasourcecode.opensourcetools.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * Created by cm on 2017/9/28.
 */
public class BillImportVO extends BaseRowModel {

    @ExcelProperty(index = 0)
    private String communityName;
    @ExcelProperty(index = 1)
    private String floorNo;
    @ExcelProperty(index = 2)
    private String unitNo;
    @ExcelProperty(index = 3)
    private String houseNo;
    @ExcelProperty(index = 4)
    private String projectName;
    @ExcelProperty(index = 5)
    private String billName;
    @ExcelProperty(index = 6)
    private String amountStr;
    @ExcelProperty(index = 7)
    private String payTerm;
    @ExcelProperty(index = 8)
    private String description;
    @ExcelProperty(index = 9)
    private String errorInfo;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {return false;}
        if (this == obj) {return true;}
        if (obj instanceof BillImportVO) {
            BillImportVO billImportVO = (BillImportVO) obj;
            if (billImportVO.communityName.equals(this.communityName) && billImportVO.floorNo.equals(this.floorNo)
                    && billImportVO.unitNo.equals(this.unitNo) && billImportVO.houseNo.equals(this.houseNo)
                    && billImportVO.projectName.equals(this.projectName) && billImportVO.billName.equals(this.billName)
                    && billImportVO.payTerm.equals(this.payTerm))
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
        return "BillImportVO{" +
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
