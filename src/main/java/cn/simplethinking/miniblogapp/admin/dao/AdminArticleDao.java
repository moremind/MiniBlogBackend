package cn.simplethinking.miniblogapp.admin.dao;

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

    List<Article> listArticles();
}
