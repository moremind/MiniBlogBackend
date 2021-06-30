package cn.simplethinking.miniblogapp.admin.controller;

import cn.simplethinking.miniblogapp.admin.request.AdminArticleRequest;
import cn.simplethinking.miniblogapp.admin.service.AdminArticleService;
import cn.simplethinking.miniblogapp.miniapp.controller.WeChatUserController;
import cn.simplethinking.miniblogapp.system.entity.Article;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@RestController
@RequestMapping("/admin/article")
public class AdminArticleController {

    Logger logger = LoggerFactory.getLogger(WeChatUserController.class);

    @Autowired
    AdminArticleService adminArticleService;

    @PostMapping("/publish")
    public Result publishArticle(@RequestBody AdminArticleRequest adminArticleRequest) {
        logger.info("publish article request:" + adminArticleRequest.toString());
        Article article = new Article();
        BeanUtils.copyProperties(adminArticleRequest, article);
        article.setTags(StringUtils.join(adminArticleRequest.getTags(), ','));
        article.setCategories(StringUtils.join(adminArticleRequest.getCategories(), ','));
        article.setPublishTime(adminArticleRequest.getPublishDate());
        logger.info(article.toString());
//        Article article = new Article();
//        BeanUtils.copyProperties(adminArticleRequest, article);
        adminArticleService.publishArticle(article);
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(), ResultEnum.GLOBAL_SUCCESS.getMessage());
    }

    @GetMapping("/get/articles")
    public Result getArticles() {
        List<Article> articles = adminArticleService.getArticles();
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(),
                ResultEnum.GLOBAL_SUCCESS.getMessage(),
                articles);
    }


}
