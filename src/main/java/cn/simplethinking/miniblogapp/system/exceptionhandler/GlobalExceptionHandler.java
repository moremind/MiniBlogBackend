package cn.simplethinking.miniblogapp.system.exceptionhandler;

import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

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
