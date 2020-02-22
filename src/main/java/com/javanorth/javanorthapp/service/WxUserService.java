package com.javanorth.javanorthapp.service;

import com.javanorth.javanorthapp.entity.WxUser;

public interface WxUserService {
    String getUserInfo(String code);

    Integer queryUserOpenId(String openId);

    boolean insertWxUser(WxUser wxUser);

}
