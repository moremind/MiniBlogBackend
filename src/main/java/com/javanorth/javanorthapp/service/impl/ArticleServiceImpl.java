package com.javanorth.javanorthapp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javanorth.javanorthapp.dao.ArticleDao;
import com.javanorth.javanorthapp.entity.Article;
import com.javanorth.javanorthapp.entity.ArticleEntity;
import com.javanorth.javanorthapp.service.ArticleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    ArticleDao articleDao;

    @Override
    public boolean addArticle(Article article) {
        try {
            return articleDao.insertArticle(article);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return false;
    }

    @Override
    public List<ArticleEntity> getAllArticles() {
        try {
            return articleDao.getAllArticle();
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return null;
    }

    @Override
    public PageInfo<ArticleEntity> getOnePageArticle(Integer pageNum, Integer pageSize) {
        //设定当前页码，以及当前页显示的条数
        PageHelper.startPage(pageNum, pageSize);
        List<ArticleEntity> articles = getAllArticles();
        return new PageInfo<>(articles);
    }

    @Override
    public String getContent(Integer articleId) {
        try {
            return articleDao.getArticleContent(articleId);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @Override
    public List<ArticleEntity> getCategoryArticle(String origin) {
        try {
            return articleDao.getCategoryArticles(origin);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @Override
    public List<ArticleEntity> getArticleByKeyword(String keyword) {
        try {
            return articleDao.getArticleByKeyword(keyword);
        } catch (Exception e) {
            logger.info(e.getCause().toString());
        }
        return null;
    }
}
