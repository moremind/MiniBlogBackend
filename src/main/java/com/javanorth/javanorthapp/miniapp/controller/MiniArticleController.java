package com.javanorth.javanorthapp.miniapp.controller;

import com.javanorth.javanorthapp.system.response.Result;
import com.javanorth.javanorthapp.system.response.ResultEnum;
import com.javanorth.javanorthapp.system.response.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 小程序端文章接口
 * @see CommonController
 * @since 1.0.0
 */
@RestController
@RequestMapping("/article")
public class MiniArticleController implements CommonController{

    @GetMapping(value = "/get/articles")
    public Result getArticles(int pageNum, int articleNum) {
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(), ResultEnum.GLOBAL_SUCCESS.getMessage());
    }
}
