package cn.simplethinking.miniblogapp.admin.controller;

import cn.simplethinking.miniblogapp.admin.dto.AdminArticleDTO;
import cn.simplethinking.miniblogapp.admin.request.AdminArticleRequest;
import cn.simplethinking.miniblogapp.admin.service.AdminArticleService;
import cn.simplethinking.miniblogapp.miniapp.controller.WeChatUserController;
import cn.simplethinking.miniblogapp.system.entity.Article;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@RestController
@RequestMapping("/admin/article")
public class AdminArticleController {

    Logger logger = LoggerFactory.getLogger(WeChatUserController.class);

    @Autowired
    AdminArticleService adminArticleService;

    /**
     * 服务端发布文章
     * @param adminArticleRequest
     * @return
     */
    @PostMapping("/publish")
    public Result publishArticle(@RequestBody AdminArticleRequest adminArticleRequest) {
        logger.info("publish article request: {}", adminArticleRequest.toString());
        Article article = new Article();
        BeanUtils.copyProperties(adminArticleRequest, article);
        article.setTags(StringUtils.join(adminArticleRequest.getTags(), ','));
        article.setCategories(StringUtils.join(adminArticleRequest.getCategories(), ','));
        article.setPublishTime(adminArticleRequest.getPublishDate());
        logger.info(article.toString());
        adminArticleService.publishArticle(article);
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(), ResultEnum.GLOBAL_SUCCESS.getMessage());
    }

    /**
     * 显示分页的文章
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("/get/articles")
    public Result getArticles(@RequestParam(value = "pageIndex", defaultValue = "1") int pageIndex,
                              @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        logger.info("pageIndex: {}, pageSize: {}", pageIndex, pageSize);
        PageInfo<AdminArticleDTO> articles = adminArticleService.getArticles(pageIndex, pageSize);
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(),
                ResultEnum.GLOBAL_SUCCESS.getMessage(),
                articles);
    }

    /**
     * 获取文章详情
     * @param id id
     * @return
     */
    @GetMapping("/get")
    public Result getArticleById(@RequestParam("id") int id) {
        logger.info("get article by id: {}", id);
        Article article = adminArticleService.getArticleById(id);
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(),
                ResultEnum.GLOBAL_SUCCESS.getMessage(),
                article);
    }

    /**
     * 根据id删除文章
     * @param id
     * @return
     */
    @PostMapping("/delete")
    public Result deleteArticleById(@RequestParam("id") int id) {
        logger.info("delete article by id: {}", id);
        boolean result = adminArticleService.deleteArticleById(id);
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(),
                ResultEnum.GLOBAL_SUCCESS.getMessage(),
                result);
    }


}
