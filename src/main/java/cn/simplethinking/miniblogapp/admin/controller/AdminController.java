package cn.simplethinking.miniblogapp.admin.controller;

import cn.simplethinking.miniblogapp.admin.request.AdminLoginRequest;
import cn.simplethinking.miniblogapp.admin.service.AdminService;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 管理员用户接口
 * @see AdminController
 * @since 1.0.0
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping(value = "/login")
    public Result login(@RequestBody AdminLoginRequest adminLoginRequest) {
        adminService.login(adminLoginRequest.getUsername(), adminLoginRequest.getPassword());
        return ResultUtil.success(ResultEnum.ADMIN_LOGIN_SUCCESS.getCode(), ResultEnum.ADMIN_LOGIN_SUCCESS.getMessage());
    }
}
