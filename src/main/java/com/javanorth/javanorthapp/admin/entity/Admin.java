package com.javanorth.javanorthapp.admin.entity;

import java.util.Date;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 管理员实体
 * @see
 * @since 1.0.0
 */
public class Admin {
    /**
     * 管理员id
     */
    private Integer id;

    /**
     * 管理员用户名
     */
    private String username;

    /**
     * 管理员密码，使用md5加密过后存储的密码
     */
    private String password;

    /**
     * 管理员上一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 管理员登录时间
     */
    private Date loginTime;

    /**
     * 管理员创建时间
     */
    private Date createTime;

    /**
     * 管理员信息更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", loginTime=" + loginTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
