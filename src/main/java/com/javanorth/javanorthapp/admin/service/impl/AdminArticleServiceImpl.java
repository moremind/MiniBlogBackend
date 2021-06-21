package com.javanorth.javanorthapp.admin.service.impl;

import com.javanorth.javanorthapp.admin.dao.AdminArticleDao;
import com.javanorth.javanorthapp.admin.service.AdminArticleService;
import com.javanorth.javanorthapp.system.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @description
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @see
 * @since
 */
@Service
public class AdminArticleServiceImpl implements AdminArticleService {

    @Autowired
    AdminArticleDao adminArticleDao;

    @Override
    public boolean publishArticle(Article article) {
        return false;
    }
}
