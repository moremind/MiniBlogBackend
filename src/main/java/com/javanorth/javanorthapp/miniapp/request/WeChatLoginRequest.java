package com.javanorth.javanorthapp.miniapp.request;

import com.javanorth.javanorthapp.miniapp.dto.WeChatUserDTO;
import com.javanorth.javanorthapp.miniapp.entity.WeChatUser;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description WeChat user login request
 * @see
 * @since 1.0.0
 */
public class WeChatLoginRequest {
    private String code;
    private WeChatUserDTO userInfo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WeChatUserDTO getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(WeChatUserDTO userInfo) {
        this.userInfo = userInfo;
    }
}
