package cn.simplethinking.miniblogapp.admin.controller;

import cn.simplethinking.miniblogapp.admin.request.AdminArticleRequest;
import cn.simplethinking.miniblogapp.admin.service.AdminArticleService;
import cn.simplethinking.miniblogapp.miniapp.controller.CommonController;
import cn.simplethinking.miniblogapp.miniapp.controller.WeChatUserController;
import cn.simplethinking.miniblogapp.system.entity.Article;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@RestController
@RequestMapping("/article")
public class AdminArticleController implements CommonController {

    Logger logger = LoggerFactory.getLogger(WeChatUserController.class);

    @Autowired
    AdminArticleService adminArticleService;

    @PostMapping("/publish")
    public Result publishArticle(AdminArticleRequest adminArticleRequest) {
        logger.info("publish article request:" + adminArticleRequest.toString());
        Article article = new Article();
        BeanUtils.copyProperties(adminArticleRequest, article);
        adminArticleService.publishArticle(article);
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(), ResultEnum.GLOBAL_SUCCESS.getMessage());
    }


}
