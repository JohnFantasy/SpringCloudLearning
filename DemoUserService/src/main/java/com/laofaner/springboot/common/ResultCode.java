package com.laofaner.springboot.common;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.common
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-04 23:26
 * @Description: The union return code enumeration class
 * @Version 1.0
 */
public enum ResultCode {
    /**
     * The union return code enumeration class
     */

    SUCESS(0, "sucess"),
    FAILED(1, "failed");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
