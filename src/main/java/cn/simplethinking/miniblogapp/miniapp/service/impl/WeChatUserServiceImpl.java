package cn.simplethinking.miniblogapp.miniapp.service.impl;//package com.javanorth.javanorthapp.miniapp.service.impl;

import com.google.gson.Gson;
import cn.simplethinking.miniblogapp.miniapp.config.WxAppConfig;
import cn.simplethinking.miniblogapp.miniapp.constant.WeChatConstant;
import cn.simplethinking.miniblogapp.miniapp.dao.WeChatUserDao;
import cn.simplethinking.miniblogapp.miniapp.dto.WeChatUserDTO;
import cn.simplethinking.miniblogapp.miniapp.entity.WeChatUser;
import cn.simplethinking.miniblogapp.miniapp.exception.WeChatUserLoginException;
import cn.simplethinking.miniblogapp.miniapp.service.WeChatUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WeChatUserServiceImpl implements WeChatUserService {
    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    WxAppConfig wxAppConfig;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WeChatUserDao weChatUserDao;

    @Override
    public String userLogin(String code, WeChatUserDTO weChatUserDTO) {
        ResponseEntity<String> response = null;
        try {
            String ulr = urlConcat(code);
            restTemplate.getForEntity((ulr), String.class);
            // 通过response拿到用户open_id 和 session_key
            WeChatUser weChatUser = new WeChatUser();
            BeanUtils.copyProperties(weChatUserDTO, weChatUser);

            // 根据openId进行查询，如果已经有记录就进行更新，如果没有该用户就插入
            String openid = getOpenid(response.getBody()).get("openid");
            weChatUser.setOpenId(openid);
            weChatUserDao.insertWeChatUser(weChatUser);
            if (response.getStatusCode() == HttpStatus.OK) {
                return response.getBody();
            } else {
                throw new WeChatUserLoginException(response.getBody());
            }
        } catch (Exception e) {
            throw new WeChatUserLoginException(e.getMessage());
        }
    }

    /**
     * 微信小程序服务端的url拼接
     * @param code
     * @return
     */
    private String urlConcat(String code) {
        StringBuffer url = new StringBuffer();
        url.append(WeChatConstant.LOGIN_URL)
                .append("&appid=").append(wxAppConfig.getAppId())
                .append("&secret=").append(wxAppConfig.getSecret())
                .append("&js_code=").append(code)
                .append("&grant_type=").append(wxAppConfig.getAuthCode());
        return String.valueOf(url);
    }

    /**
     * 通过请求获取到openid
     * @param response response
     * @param <T> 传入的参数类型
     * @return
     */
    private static <T> Map<T, T> getOpenid(T response) {
        Gson gson = new Gson();
        return gson.fromJson(String.valueOf(response), Map.class);
    }

}
