package com.javanorth.javanorthapp.miniapp.service.impl;

import com.javanorth.javanorthapp.miniapp.dao.WxUserDao;
import com.javanorth.javanorthapp.miniapp.entity.WxUser;
import com.javanorth.javanorthapp.miniapp.pojo.WxConfig;
import com.javanorth.javanorthapp.miniapp.service.WxUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WxUserServiceImpl implements WxUserService {
    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    WxConfig wxConfig;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WxUserDao wxUserDao;

    @Override
    public String getUserInfo(String code) {

        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="
                + wxConfig.getAppId() + "&secret=" + wxConfig.getSecret()
                + "&js_code="+code + "&grant_type="+wxConfig.getAuthCode();

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        logger.info(response.toString());
        return response.getStatusCode() == HttpStatus.OK ? response.getBody() : null;
    }

    @Override
    public Integer queryUserOpenId(String openId) {
        try {
            return wxUserDao.queryUserIdByOpenId(openId);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean insertWxUser(WxUser wxUser) {
        try {
            return wxUserDao.insertWxUser(wxUser);
        } catch (Exception e) {
            logger.error(e.toString());
        }
        return false;
    }
}
