package com.javanorth.javanorthapp.miniapp.dao;

import com.javanorth.javanorthapp.miniapp.entity.WeChatUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description wechat user dao
 * @see WeChatUserDao
 * @since 1.0.0
 */
@Component
@Mapper
public interface WeChatUserDao {

    /**
     * 插入微信用户数据
     * @param weChatUser 微信用户数据
     */
    void insertWeChatUser(WeChatUser weChatUser);
}
