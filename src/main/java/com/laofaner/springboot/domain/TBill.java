package com.laofaner.springboot.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class TBill implements Serializable {

    private static final long serialVersionUID = 1554394707844L;


    /**
    * 主键
    * the id of a bill
    * isNullAble:0,defaultVal:
    */
    private String billNo;

    /**
    * the amount of the bill
    * isNullAble:0,defaultVal:0
    */
    private Double billAmount;

    /**
    * the order of the bill
    * isNullAble:1
    */
    private String orderNo;

    /**
    * the create time of the bill
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createTime;

    /**
    * the update time of the bill
    * isNullAble:1
    */
    private java.time.LocalDateTime updateTime;


    public void setBillNo(String billNo){this.billNo = billNo;}

    public String getBillNo(){return this.billNo;}

    public void setBillAmount(Double billAmount){this.billAmount = billAmount;}

    public Double getBillAmount(){return this.billAmount;}

    public void setOrderNo(String orderNo){this.orderNo = orderNo;}

    public String getOrderNo(){return this.orderNo;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "TBill{" +
                "billNo='" + billNo + '\'' +
                "billAmount='" + billAmount + '\'' +
                "orderNo='" + orderNo + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private TBill set;

        private ConditionBuilder where;

        public UpdateBuilder set(TBill set){
            this.set = set;
            return this;
        }

        public TBill getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends TBill{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> billNoList;

        public List<String> getBillNoList(){return this.billNoList;}


        private List<String> fuzzyBillNo;

        public List<String> getFuzzyBillNo(){return this.fuzzyBillNo;}

        private List<String> rightFuzzyBillNo;

        public List<String> getRightFuzzyBillNo(){return this.rightFuzzyBillNo;}
        private List<Double> billAmountList;

        public List<Double> getBillAmountList(){return this.billAmountList;}

        private Double billAmountSt;

        private Double billAmountEd;

        public Double getBillAmountSt(){return this.billAmountSt;}

        public Double getBillAmountEd(){return this.billAmountEd;}

        private List<String> orderNoList;

        public List<String> getOrderNoList(){return this.orderNoList;}


        private List<String> fuzzyOrderNo;

        public List<String> getFuzzyOrderNo(){return this.fuzzyOrderNo;}

        private List<String> rightFuzzyOrderNo;

        public List<String> getRightFuzzyOrderNo(){return this.rightFuzzyOrderNo;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyBillNo (List<String> fuzzyBillNo){
            this.fuzzyBillNo = fuzzyBillNo;
            return this;
        }

        public QueryBuilder fuzzyBillNo (String ... fuzzyBillNo){
            this.fuzzyBillNo = solveNullList(fuzzyBillNo);
            return this;
        }

        public QueryBuilder rightFuzzyBillNo (List<String> rightFuzzyBillNo){
            this.rightFuzzyBillNo = rightFuzzyBillNo;
            return this;
        }

        public QueryBuilder rightFuzzyBillNo (String ... rightFuzzyBillNo){
            this.rightFuzzyBillNo = solveNullList(rightFuzzyBillNo);
            return this;
        }

        public QueryBuilder billNo(String billNo){
            setBillNo(billNo);
            return this;
        }

        public QueryBuilder billNoList(String ... billNo){
            this.billNoList = solveNullList(billNo);
            return this;
        }

        public QueryBuilder billNoList(List<String> billNo){
            this.billNoList = billNo;
            return this;
        }

        public QueryBuilder fetchBillNo(){
            setFetchFields("fetchFields","billNo");
            return this;
        }

        public QueryBuilder excludeBillNo(){
            setFetchFields("excludeFields","billNo");
            return this;
        }

        public QueryBuilder billAmountBetWeen(Double billAmountSt,Double billAmountEd){
            this.billAmountSt = billAmountSt;
            this.billAmountEd = billAmountEd;
            return this;
        }

        public QueryBuilder billAmountGreaterEqThan(Double billAmountSt){
            this.billAmountSt = billAmountSt;
            return this;
        }
        public QueryBuilder billAmountLessEqThan(Double billAmountEd){
            this.billAmountEd = billAmountEd;
            return this;
        }


        public QueryBuilder billAmount(Double billAmount){
            setBillAmount(billAmount);
            return this;
        }

        public QueryBuilder billAmountList(Double ... billAmount){
            this.billAmountList = solveNullList(billAmount);
            return this;
        }

        public QueryBuilder billAmountList(List<Double> billAmount){
            this.billAmountList = billAmount;
            return this;
        }

        public QueryBuilder fetchBillAmount(){
            setFetchFields("fetchFields","billAmount");
            return this;
        }

        public QueryBuilder excludeBillAmount(){
            setFetchFields("excludeFields","billAmount");
            return this;
        }

        public QueryBuilder fuzzyOrderNo (List<String> fuzzyOrderNo){
            this.fuzzyOrderNo = fuzzyOrderNo;
            return this;
        }

        public QueryBuilder fuzzyOrderNo (String ... fuzzyOrderNo){
            this.fuzzyOrderNo = solveNullList(fuzzyOrderNo);
            return this;
        }

        public QueryBuilder rightFuzzyOrderNo (List<String> rightFuzzyOrderNo){
            this.rightFuzzyOrderNo = rightFuzzyOrderNo;
            return this;
        }

        public QueryBuilder rightFuzzyOrderNo (String ... rightFuzzyOrderNo){
            this.rightFuzzyOrderNo = solveNullList(rightFuzzyOrderNo);
            return this;
        }

        public QueryBuilder orderNo(String orderNo){
            setOrderNo(orderNo);
            return this;
        }

        public QueryBuilder orderNoList(String ... orderNo){
            this.orderNoList = solveNullList(orderNo);
            return this;
        }

        public QueryBuilder orderNoList(List<String> orderNo){
            this.orderNoList = orderNo;
            return this;
        }

        public QueryBuilder fetchOrderNo(){
            setFetchFields("fetchFields","orderNo");
            return this;
        }

        public QueryBuilder excludeOrderNo(){
            setFetchFields("excludeFields","orderNo");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public TBill build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> billNoList;

        public List<String> getBillNoList(){return this.billNoList;}


        private List<String> fuzzyBillNo;

        public List<String> getFuzzyBillNo(){return this.fuzzyBillNo;}

        private List<String> rightFuzzyBillNo;

        public List<String> getRightFuzzyBillNo(){return this.rightFuzzyBillNo;}
        private List<Double> billAmountList;

        public List<Double> getBillAmountList(){return this.billAmountList;}

        private Double billAmountSt;

        private Double billAmountEd;

        public Double getBillAmountSt(){return this.billAmountSt;}

        public Double getBillAmountEd(){return this.billAmountEd;}

        private List<String> orderNoList;

        public List<String> getOrderNoList(){return this.orderNoList;}


        private List<String> fuzzyOrderNo;

        public List<String> getFuzzyOrderNo(){return this.fuzzyOrderNo;}

        private List<String> rightFuzzyOrderNo;

        public List<String> getRightFuzzyOrderNo(){return this.rightFuzzyOrderNo;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}


        public ConditionBuilder fuzzyBillNo (List<String> fuzzyBillNo){
            this.fuzzyBillNo = fuzzyBillNo;
            return this;
        }

        public ConditionBuilder fuzzyBillNo (String ... fuzzyBillNo){
            this.fuzzyBillNo = solveNullList(fuzzyBillNo);
            return this;
        }

        public ConditionBuilder rightFuzzyBillNo (List<String> rightFuzzyBillNo){
            this.rightFuzzyBillNo = rightFuzzyBillNo;
            return this;
        }

        public ConditionBuilder rightFuzzyBillNo (String ... rightFuzzyBillNo){
            this.rightFuzzyBillNo = solveNullList(rightFuzzyBillNo);
            return this;
        }

        public ConditionBuilder billNoList(String ... billNo){
            this.billNoList = solveNullList(billNo);
            return this;
        }

        public ConditionBuilder billNoList(List<String> billNo){
            this.billNoList = billNo;
            return this;
        }

        public ConditionBuilder billAmountBetWeen(Double billAmountSt,Double billAmountEd){
            this.billAmountSt = billAmountSt;
            this.billAmountEd = billAmountEd;
            return this;
        }

        public ConditionBuilder billAmountGreaterEqThan(Double billAmountSt){
            this.billAmountSt = billAmountSt;
            return this;
        }
        public ConditionBuilder billAmountLessEqThan(Double billAmountEd){
            this.billAmountEd = billAmountEd;
            return this;
        }


        public ConditionBuilder billAmountList(Double ... billAmount){
            this.billAmountList = solveNullList(billAmount);
            return this;
        }

        public ConditionBuilder billAmountList(List<Double> billAmount){
            this.billAmountList = billAmount;
            return this;
        }

        public ConditionBuilder fuzzyOrderNo (List<String> fuzzyOrderNo){
            this.fuzzyOrderNo = fuzzyOrderNo;
            return this;
        }

        public ConditionBuilder fuzzyOrderNo (String ... fuzzyOrderNo){
            this.fuzzyOrderNo = solveNullList(fuzzyOrderNo);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderNo (List<String> rightFuzzyOrderNo){
            this.rightFuzzyOrderNo = rightFuzzyOrderNo;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderNo (String ... rightFuzzyOrderNo){
            this.rightFuzzyOrderNo = solveNullList(rightFuzzyOrderNo);
            return this;
        }

        public ConditionBuilder orderNoList(String ... orderNo){
            this.orderNoList = solveNullList(orderNo);
            return this;
        }

        public ConditionBuilder orderNoList(List<String> orderNo){
            this.orderNoList = orderNo;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private TBill obj;

        public Builder(){
            this.obj = new TBill();
        }

        public Builder billNo(String billNo){
            this.obj.setBillNo(billNo);
            return this;
        }
        public Builder billAmount(Double billAmount){
            this.obj.setBillAmount(billAmount);
            return this;
        }
        public Builder orderNo(String orderNo){
            this.obj.setOrderNo(orderNo);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public TBill build(){return obj;}
    }

}
