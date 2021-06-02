package com.javanorth.javanorthapp.miniapp.service;

import com.javanorth.javanorthapp.miniapp.entity.WxUser;

public interface WxUserService {
    String getUserInfo(String code);

    Integer queryUserOpenId(String openId);

    boolean insertWxUser(WxUser wxUser);

}
