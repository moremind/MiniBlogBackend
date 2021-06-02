package com.javanorth.javanorthapp.miniapp.service;

import com.github.pagehelper.PageInfo;
import com.javanorth.javanorthapp.miniapp.entity.Article;
import com.javanorth.javanorthapp.miniapp.entity.ArticleEntity;

import java.util.List;

public interface ArticleService {
    /**
     * 添加文章
     * @param article 文章
     * @return 是否成功
     */
    boolean addArticle(Article article);

    /**
     * 获取所有文章
     * @return 所有文章
     */
    List<ArticleEntity> getAllArticles();

    /**
     * 获取分页文章
     * @param pageNum 页数
     * @param pageSize 每页多少数目
     * @return 分页后的文章
     */
    PageInfo<ArticleEntity> getOnePageArticle(Integer pageNum, Integer pageSize);

    /**
     * 通过文章id获取文章内容
     * @param articleId 文章id
     * @return 文章内容
     */
    String getContent(Integer articleId);

    /**
     * 通过分类查询所有文章
     * @param origin
     * @return
     */
    List<ArticleEntity> getCategoryArticle(String origin);

    /**
     * 通过关键字查询文章
     * @param keyword
     * @return
     */
    List<ArticleEntity> getArticleByKeyword(String keyword);

}
