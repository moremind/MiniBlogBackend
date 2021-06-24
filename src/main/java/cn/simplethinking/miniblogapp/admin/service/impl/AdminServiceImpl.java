package cn.simplethinking.miniblogapp.admin.service.impl;

import cn.simplethinking.miniblogapp.admin.dao.AdminUserDao;
import cn.simplethinking.miniblogapp.admin.entity.Admin;
import cn.simplethinking.miniblogapp.admin.exception.AdminNotExistException;
import cn.simplethinking.miniblogapp.admin.exception.AdminPasswordErrorException;
import cn.simplethinking.miniblogapp.admin.service.AdminService;
import cn.simplethinking.miniblogapp.miniapp.controller.WeChatUserController;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@Service
public class AdminServiceImpl implements AdminService {

    Logger logger = LoggerFactory.getLogger(WeChatUserController.class);

    @Autowired
    AdminUserDao adminUserDao;

    /**
     * 登录需要处理的两件事
     * 1.密码匹配
     * 2.更新用户登录时间和上次登录时间
     * @param username
     * @return
     */
    @Override
    public boolean login(String username, String password) {
        Admin admin = adminUserDao.getAdmin(username);

        // 如果用户名和密码匹配则处理用户登录时间和上次登录时间
        Optional.ofNullable(admin).orElseThrow(() -> new AdminNotExistException(
                ResultEnum.ADMIN_USER_NOT_EXIST.getMessage()));
        if (password.equals(admin.getPassword())) {
            Date lastLoginTime = admin.getLoginTime();
            return adminUserDao.updateAdminLogin(admin.getUsername(), lastLoginTime);
        } else {
            throw new AdminPasswordErrorException();
        }
    }
}
