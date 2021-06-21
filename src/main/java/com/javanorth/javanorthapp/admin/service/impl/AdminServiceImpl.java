package com.javanorth.javanorthapp.admin.service.impl;

import com.javanorth.javanorthapp.admin.dao.AdminUserDao;
import com.javanorth.javanorthapp.admin.entity.Admin;
import com.javanorth.javanorthapp.admin.exception.AdminNotExistException;
import com.javanorth.javanorthapp.admin.exception.AdminPasswordErrorException;
import com.javanorth.javanorthapp.admin.service.AdminService;
import com.javanorth.javanorthapp.system.response.ResultEnum;
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
            return adminUserDao.updateAdminLogin(lastLoginTime);
        } else {
            throw new AdminPasswordErrorException();
        }
    }
}
