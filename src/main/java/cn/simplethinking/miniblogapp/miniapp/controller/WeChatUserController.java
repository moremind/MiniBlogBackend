package cn.simplethinking.miniblogapp.miniapp.controller;

import cn.simplethinking.miniblogapp.miniapp.request.WeChatLoginRequest;
import cn.simplethinking.miniblogapp.miniapp.service.WeChatUserService;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */

@RestController
@RequestMapping("/wechat")
public class WeChatUserController {
    Logger logger = LoggerFactory.getLogger(WeChatUserController.class);

    @Autowired
    WeChatUserService weChatUserService;

    @RequestMapping(value = "/login")
    public Result WeChatUserLogin(@RequestBody WeChatLoginRequest request) {
        logger.info("request parameters: " + request.getCode() + request.getUserInfo());
        String result = weChatUserService.userLogin(request.getCode(), request.getUserInfo());
        return ResultUtil.success(ResultEnum.WECHAT_LOGIN_SUCCESS.getCode(), ResultEnum.WECHAT_LOGIN_SUCCESS.getMessage(),
                result);
    }


}
