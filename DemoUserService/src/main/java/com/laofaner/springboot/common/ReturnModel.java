package com.laofaner.springboot.common;

import lombok.Data;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.common
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-04 23:23
 * @Description: The union return model of the whole springboot project.
 * @Version 1.0
 */


@Data
public class ReturnModel<T> {
    private int code;
    private String msg;
    private T data;

    public ReturnModel() {

    }

    public ReturnModel(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMessage();
    }
}
