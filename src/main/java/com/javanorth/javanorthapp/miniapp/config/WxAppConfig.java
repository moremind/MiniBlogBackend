package com.javanorth.javanorthapp.miniapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description 微信小程序应用级别配置
 * @since 1.0.0
 */
@Component
//@PropertySource("classpath:wx-app-config.properties")
public class WxAppConfig {
    @Value("${wx.app-config.app-id}")
    private String appId;

    @Value("${wx.app-config.secret}")
    private String secret;

    @Value("${wx.app-config.authCode}")
    private String authCode;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}
