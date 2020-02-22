package com.javanorth.javanorthapp.controller;

import com.javanorth.javanorthapp.dto.ArticleDTO;
import com.javanorth.javanorthapp.entity.Article;
import com.javanorth.javanorthapp.response.ResultUtils;
import com.javanorth.javanorthapp.service.ArticleService;
import com.javanorth.javanorthapp.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/article")
public class ArticleController {
    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    public ResultUtils publishArticle(@RequestBody ArticleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO, article);
        article.setPublishTime(DateUtils.getCurrentFullTime());
        boolean result = articleService.addArticle(article);
        return ResultUtils.success(result);
    }

    @RequestMapping(value = "/getArticle", method = { RequestMethod.GET, RequestMethod.POST })
    public ResultUtils getPageArticle(@RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "6") Integer pageSize) {
        return ResultUtils.success(articleService.getOnePageArticle(pageNum, pageSize));
    }

    @RequestMapping(value = "/getContent", method = { RequestMethod.POST, RequestMethod.GET })
    public ResultUtils getContentById(@NotNull @RequestParam Integer articleId) {
        return ResultUtils.success(articleService.getContent(articleId));
    }

    @RequestMapping(value = "/getArticlesByCategory", method = { RequestMethod.POST, RequestMethod.GET })
    public ResultUtils getArticlesByCategory(@NotNull @RequestParam String category) {
        return ResultUtils.success(articleService.getCategoryArticle(category));
    }

    @RequestMapping(value = "/search", method = { RequestMethod.POST, RequestMethod.GET })
    public ResultUtils searchArticle(@NotNull @RequestParam String keyword) {
        return ResultUtils.success(articleService.getArticleByKeyword(keyword));
    }
}
