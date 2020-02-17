package com.javanorth.javanorthapp.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResultUtils {
    private int code;
    private String msg;
    private Object data;

    private ResultUtils(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResultUtils(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultUtils success() {
        return new ResultUtils(Result.SUCCESS.getCode(), Result.SUCCESS.getMsg());
    }

    public static ResultUtils success(Object data) {
        return new ResultUtils(Result.SUCCESS.getCode(), Result.SUCCESS.getMsg(), data);
    }

    public static ResultUtils success(int code, String msg) {
        return new ResultUtils(code, msg);
    }

    public static ResultUtils success(int code, String msg, Object data) {
        return new ResultUtils(code, msg, data);
    }

    public static ResultUtils error() {
        return new ResultUtils(Result.ERROR.getCode(), Result.ERROR.getMsg());
    }

    public static ResultUtils error(Object data) {
        return new ResultUtils(Result.ERROR.getCode(), Result.ERROR.getMsg(), data);
    }

    public static ResultUtils error(int code, String msg) {
        return new ResultUtils(code, msg);
    }

    public static ResultUtils error(int code, String msg, Object data) {
        return new ResultUtils(code, msg, data);
    }

}
