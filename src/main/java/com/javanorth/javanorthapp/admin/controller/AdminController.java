package com.javanorth.javanorthapp.admin.controller;

import com.javanorth.javanorthapp.admin.request.AdminLoginRequest;
import com.javanorth.javanorthapp.admin.service.AdminService;
import com.javanorth.javanorthapp.system.response.Result;
import com.javanorth.javanorthapp.system.response.ResultEnum;
import com.javanorth.javanorthapp.system.response.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 管理员用户接口
 * @see AdminController
 * @since 1.0.0
 */
@RestController
public class AdminController implements AdminCommonController {

    @Autowired
    AdminService adminService;

    @PostMapping(value = "/login")
    public Result login(@RequestBody AdminLoginRequest adminLoginRequest) {
        adminService.login(adminLoginRequest.getUsername(), adminLoginRequest.getPassword());
        return ResultUtil.success(ResultEnum.ADMIN_LOGIN_SUCCESS.getCode(), ResultEnum.ADMIN_LOGIN_SUCCESS.getMessage());
    }
}
