package com.zexu.controller.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record LMResult<T>(int statusCode, String message, T data) {

    public static <T> LMResult<T> success(T data) {return success(null, data);}
    public static <T> LMResult<T> success(String msg, T data) {return new LMResult<>(200, msg, data);}

    public static <T> LMResult<T> fail(int code, String msg) {
        return fail(code, msg, null);
    }
    public static <T> LMResult<T> fail(int code, String msg, T data) {
        return new LMResult<>(code, msg, data);
    }
}
