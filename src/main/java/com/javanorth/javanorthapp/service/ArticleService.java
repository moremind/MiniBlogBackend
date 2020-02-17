package com.javanorth.javanorthapp.service;

import com.github.pagehelper.PageInfo;
import com.javanorth.javanorthapp.entity.Article;
import com.javanorth.javanorthapp.entity.ArticleEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {
    boolean addArticle(Article article);

    List<ArticleEntity> getAllArticles();

    PageInfo<ArticleEntity> getOnePageArticle(Integer pageNum, Integer pageSize);

}
