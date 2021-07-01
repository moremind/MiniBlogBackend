package cn.simplethinking.miniblogapp.admin.dao;

import cn.simplethinking.miniblogapp.admin.dto.AdminArticleDTO;
import cn.simplethinking.miniblogapp.system.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @description
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @see
 * @since
 */
@Mapper
@Component
public interface AdminArticleDao {

    /**
     * 插入文章
     * @param article 文章信息
     * @return
     */
    boolean insertArticle(Article article);

    /**
     * 获取所有的文章的关键信息
     * @return
     */
    List<AdminArticleDTO> listArticles();

    /**
     * 根据id获取文章详情
     * @param id id
     * @return 文章详情
     */
    Article getArticleById(int id);

    /**
     * 删除文章
     * @param id id
     * @return
     */
    boolean deleteArticleById(int id);
}
