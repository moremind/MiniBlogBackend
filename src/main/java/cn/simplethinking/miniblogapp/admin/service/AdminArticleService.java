package cn.simplethinking.miniblogapp.admin.service;

import cn.simplethinking.miniblogapp.system.entity.Article;

/**
 *
 * @description
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @see
 * @since
 */
public interface AdminArticleService {
    boolean publishArticle(Article article);

}
