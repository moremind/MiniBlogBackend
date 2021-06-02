package com.javanorth.javanorthapp.miniapp.pojo;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
public class WxConfig {
    @Value("${wxauth.appId}")
    private String appId;

    @Value("${wxauth.secret}")
    private String secret;

    @Value("${wxauth.authCode}")
    private String authCode;
}
