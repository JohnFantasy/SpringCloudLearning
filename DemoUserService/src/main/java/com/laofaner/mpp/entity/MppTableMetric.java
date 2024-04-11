package com.laofaner.mpp.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MppTableMetric {

    private Integer dailyAmount;

    private String dailySpace;

    private Boolean indexed;

    private Date createTime;

}
