package com.javanorth.javanorthapp.dao;

import com.javanorth.javanorthapp.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CategoryDao {
    /**
     * 获取所有分类
     * @return 所有分类结果
     */
    List<Category> listCategory();
}