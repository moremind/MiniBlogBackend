package cn.simplethinking.miniblogapp.admin.exceptionhandler;

import cn.simplethinking.miniblogapp.admin.exception.AdminNotExistException;
import cn.simplethinking.miniblogapp.admin.exception.AdminPasswordErrorException;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@RestControllerAdvice
public class AdminExceptionHandler {

    @ExceptionHandler(value = AdminNotExistException.class)
    public Result adminNotExistExceptionHandler(AdminNotExistException e) {
        return ResultUtil.fail(ResultEnum.ADMIN_USER_NOT_EXIST.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = AdminPasswordErrorException.class)
    public Result adminPasswordError() {
        return ResultUtil.fail(ResultEnum.ADMIN_USER_PASSWORD_ERROR.getCode(),
                ResultEnum.ADMIN_USER_PASSWORD_ERROR.getMessage());
    }
}
