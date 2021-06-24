package cn.simplethinking.miniblogapp.miniapp.service;//package com.javanorth.javanorthapp.miniapp.service;

import cn.simplethinking.miniblogapp.miniapp.dto.WeChatUserDTO;

public interface WeChatUserService {
    String userLogin(String code, WeChatUserDTO weChatUserDTO);

//    Integer queryUserOpenId(String openId);
//
//    boolean insertWxUser(WxUser wxUser);

}
