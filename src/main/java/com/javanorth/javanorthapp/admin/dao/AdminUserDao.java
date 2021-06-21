package com.javanorth.javanorthapp.admin.dao;

import com.javanorth.javanorthapp.admin.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@Mapper
@Component
public interface AdminUserDao {
    /**
     * 通过管理用户名查询用户账号密码
     * @param username 用户名
     * @return 管理相关信息
     */
    Admin getAdmin(String username);

    /**
     * 更新上一次登陆时间以及本次登陆时间
     * @param lastLoginTime
     * @return
     */
    boolean updateAdminLogin(Date lastLoginTime);
}
