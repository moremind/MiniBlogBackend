package com.javanorth.javanorthapp.system.exceptionhandler;

import com.javanorth.javanorthapp.system.response.ResultEnum;
import com.javanorth.javanorthapp.system.response.Result;
import com.javanorth.javanorthapp.system.response.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result defaultExceptionHandler(Exception e) {
        return ResultUtil.fail(ResultEnum.GLOBAL_EXCEPTION.getCode(), ResultEnum.GLOBAL_EXCEPTION.getMessage(),
                e.getMessage());
    }
}
