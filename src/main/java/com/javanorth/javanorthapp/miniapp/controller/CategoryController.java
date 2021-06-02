package com.javanorth.javanorthapp.miniapp.controller;

import com.javanorth.javanorthapp.miniapp.entity.Category;
import com.javanorth.javanorthapp.miniapp.response.ResultUtils;
import com.javanorth.javanorthapp.miniapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/getCategory", method = { RequestMethod.GET })
    public ResultUtils getCategory() {
        List<Category> categories =  categoryService.getCategory();
        return !categories.isEmpty() ? ResultUtils.success(categories) : ResultUtils.error();
    }
}
