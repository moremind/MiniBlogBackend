package com.javanorth.javanorthapp.miniapp.dao;

import com.javanorth.javanorthapp.miniapp.entity.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface WxUserDao {
    Integer queryUserIdByOpenId(String openId);

    /**
     * 插入用户
     * @param wxUser 微信用户信息
     * @return true or false
     */
    boolean insertWxUser(WxUser wxUser);
}
