package com.laofaner.springboot.domain.vo;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 行记录对象
 * @author: fyz
 * @create: 2019-12-04 16:57
 **/
public class TableRow {
    private String columnName;
    private String comment;
    private String dataType;
    private String isNull;
    private String defaultValue;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getIsNull() {
        return isNull;
    }

    public void setIsNull(String isNull) {
        this.isNull = isNull;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
