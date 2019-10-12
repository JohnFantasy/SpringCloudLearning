package com.laofaner.springboot.domain.vo;

import java.math.BigDecimal;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 坐标模拟类
 * @author: fyz
 * @create: 2019-09-26 09:17
 **/
public class Coornidate {

    private BigDecimal longitude;

    private BigDecimal latitude;

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
