package com.zexu.controller.response;

public record LMResult<T>(int statusCode, String message, T data) {

    public static <T> LMResult<T> success(T data) {return success(null, data);}
    public static <T> LMResult<T> success(String msg, T data) {return new LMResult<>(200, msg, data);}
}
