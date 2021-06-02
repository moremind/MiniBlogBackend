package com.javanorth.javanorthapp.miniapp.service.impl;

import com.javanorth.javanorthapp.miniapp.dao.CategoryDao;
import com.javanorth.javanorthapp.miniapp.entity.Category;
import com.javanorth.javanorthapp.miniapp.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> getCategory() {
        try {
            logger.info(categoryDao.listCategory().toString());
            return categoryDao.listCategory();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }
}
