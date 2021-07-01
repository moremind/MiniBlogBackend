package cn.simplethinking.miniblogapp.admin.service;

import cn.simplethinking.miniblogapp.admin.dto.AdminArticleDTO;
import cn.simplethinking.miniblogapp.system.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 *
 * @description
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @see
 * @since
 */
public interface AdminArticleService {
    /**
     * 发布文章功能
     * @param article
     * @return
     */
    boolean publishArticle(Article article);

    /**
     * 获取指定的文章列表
     * @param pageIndex 页号
     * @param pageSize 页大小
     * @return
     */
    PageInfo<AdminArticleDTO> getArticles(int pageIndex, int pageSize);

    /**
     * 获取文章详情
     * @param id id
     * @return
     */
    Article getArticleById(int id);

    /**
     * 删除指定id的文章
     * @param id id
     * @return
     */
    boolean deleteArticleById(int id);

}
