package com.zexu.common.utils;


import com.zexu.controller.response.LMResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public LMResult doException(Exception exception) {
        return LMResult.fail(100, "错误");
    }
}
