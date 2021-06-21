package com.javanorth.javanorthapp.admin.controller;

import com.javanorth.javanorthapp.admin.request.AdminArticleRequest;
import com.javanorth.javanorthapp.admin.service.AdminArticleService;
import com.javanorth.javanorthapp.miniapp.controller.CommonController;
import com.javanorth.javanorthapp.system.entity.Article;
import com.javanorth.javanorthapp.system.response.Result;
import com.javanorth.javanorthapp.system.response.ResultEnum;
import com.javanorth.javanorthapp.system.response.ResultUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@RestController
public class AdminArticleController implements CommonController {

    @Autowired
    AdminArticleService adminArticleService;

    @PostMapping("/publish")
    public Result publishArticle(AdminArticleRequest adminArticleRequest) {
        Article article = new Article();
        BeanUtils.copyProperties(adminArticleRequest, article);
        adminArticleService.publishArticle(article);
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(), ResultEnum.GLOBAL_SUCCESS.getMessage());
    }


}
