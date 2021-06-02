package com.javanorth.javanorthapp.miniapp.dao;

import com.javanorth.javanorthapp.miniapp.entity.Article;
import com.javanorth.javanorthapp.miniapp.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ArticleDao {
    /**
     *  Insert Article
     * @param article article
     * @return insert successfully
     */
    boolean insertArticle(Article article);

    /**
     * 获取所有文章
     * @return
     */
    List<ArticleEntity> getAllArticle();

    /**
     * 通过文章id获取文章内容
     * @param articleId 文章id
     * @return 文章内容
     */
    String getArticleContent(Integer articleId);

    /**
     * 通过分类获取文章
     * @param category 分类
     * @return 分类后的文章
     */
    List<ArticleEntity> getCategoryArticles(String category);

    /**
     * 通过keyword查询文章
     * @param keyword keyword
     * @return 文章列表
     */
    List<ArticleEntity> getArticleByKeyword(String keyword);
}
