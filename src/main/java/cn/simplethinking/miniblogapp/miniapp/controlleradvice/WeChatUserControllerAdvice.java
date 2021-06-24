package cn.simplethinking.miniblogapp.miniapp.controlleradvice;

import cn.simplethinking.miniblogapp.miniapp.controller.WeChatUserController;
import cn.simplethinking.miniblogapp.miniapp.exception.WeChatUserLoginException;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description WeChat User Controller Handler
 * @see WeChatUserController
 * @since 1.0.0
 */
@RestControllerAdvice
public class WeChatUserControllerAdvice {

    /**
     * 接口调用异常则将错误结果返回
     * @param exception 异常信息
     * @return
     */
    @ExceptionHandler(value = WeChatUserLoginException.class)
    public Result handlerWeChatException(WeChatUserLoginException exception) {
        return ResultUtil.fail(ResultEnum.WECHAT_LOGIN_FAILED.getCode(), ResultEnum.WECHAT_LOGIN_FAILED.getMessage(),
                exception.getMessage());
    }

}
