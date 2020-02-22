package com.javanorth.javanorthapp.controller;

import com.javanorth.javanorthapp.dto.VerifyUserDTO;
import com.javanorth.javanorthapp.dto.WxUserDTO;
import com.javanorth.javanorthapp.entity.WxUser;
import com.javanorth.javanorthapp.response.ResultUtils;
import com.javanorth.javanorthapp.service.WxUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/user")
public class WxUserController {
    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    WxUserService wxUserService;

    @RequestMapping("/onLogin")
    public ResultUtils getUserInfo(@NotNull @RequestParam String code) {

        return ResultUtils.success(wxUserService.getUserInfo(code));
    }

    @RequestMapping("/verify")
    public ResultUtils verifyUser(@RequestBody VerifyUserDTO verifyUserDTO) {
       return ResultUtils.success(wxUserService.queryUserOpenId(verifyUserDTO.getOpenId()));
    }

    @RequestMapping("/register")
    public ResultUtils registerUser(@RequestBody WxUserDTO wxUserDTO){
        WxUser wxUser = new WxUser();
        BeanUtils.copyProperties(wxUserDTO, wxUser);
        logger.info(wxUser.toString());

        return ResultUtils.success(wxUserService.insertWxUser(wxUser));

    }
}
