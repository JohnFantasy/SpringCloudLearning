package com.laofaner.springboot.util;

/**
 * Created by liyuan 2018.03.31
 */

public class FunctionResult<T> {
    /**
     * 响应码
     */
    protected int code;

    /**
     * 响应消息
     */
    protected String message;

    /**
     * 响应对象
     */
    protected T value;

    public FunctionResult() {
        code = 0;
        message = "成功";
    }

    public FunctionResult(IResultCode code) {
        this.code = code.getCode();
        this.message = code.getDesc();
        this.value = null;
    }


    public FunctionResult(IResultCode code, T value) {
        this.code = code.getCode();
        this.message = code.getDesc();
        this.value = value;
    }

    public FunctionResult(int code, String message, T value) {
        this.code = code;
        this.message = message;
        this.value = value;
    }

    public static <T> FunctionResult<T> SUCCESS(T value) {
        return new FunctionResult(ResultCode.Success, value);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        if (message == null || message.equals("")) {
            message = ResultCode.values()[code].getDesc();
        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        if (value != null) {
            this.code = 0;
            this.message = "";
        }
        this.value = value;
    }

    public void setResultCode(IResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getDesc();
    }

    public FunctionResult<T> SuccessWithValue() {
        this.code = 0;
        this.message = "";

        return this;
    }

    public FunctionResult<T> Success() {
        this.code = 0;
        this.message = "";
        this.value = null;

        return this;
    }
}


