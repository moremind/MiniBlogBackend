package com.javanorth.javanorthapp.dao;

import com.javanorth.javanorthapp.dto.ArticleDTO;
import com.javanorth.javanorthapp.entity.Article;
import com.javanorth.javanorthapp.entity.ArticleEntity;
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
}
