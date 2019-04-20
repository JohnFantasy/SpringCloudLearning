package com.laofaner.springboot.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

/**
 *
 */
public class ExceptionOperator {
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public FunctionResult processExcption(NativeWebRequest request, Exception e) {
        System.out.println(e.getMessage());
        logger.error("这个是一个伟大的异常<--错就错还不认错<--矫情", e);
        return new FunctionResult(ResultCode.UnknownExcetion, e.getMessage());
    }
}
