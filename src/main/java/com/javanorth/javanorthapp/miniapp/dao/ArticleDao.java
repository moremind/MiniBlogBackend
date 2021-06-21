package com.javanorth.javanorthapp.miniapp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description Article Dao
 * @see ArticleDao
 * @since 1.0.0
 */
@Mapper
@Component
public interface ArticleDao {
    /**
     * 获取所有的文章列表
     */
    void getArticles();
}
