package cn.simplethinking.miniblogapp.miniapp.request;

import cn.simplethinking.miniblogapp.miniapp.dto.WeChatUserDTO;

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
