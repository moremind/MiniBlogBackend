package cn.simplethinking.miniblogapp.admin.service.impl;

import cn.simplethinking.miniblogapp.admin.dao.AdminArticleDao;
import cn.simplethinking.miniblogapp.admin.dto.AdminArticleDTO;
import cn.simplethinking.miniblogapp.admin.service.AdminArticleService;
import cn.simplethinking.miniblogapp.system.entity.Article;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @description
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @see
 * @since
 */
@Service
public class AdminArticleServiceImpl implements AdminArticleService {

    @Autowired
    AdminArticleDao adminArticleDao;

    @Override
    public boolean publishArticle(Article article) {
        return adminArticleDao.insertArticle(article);
    }

    @Override
    public PageInfo<AdminArticleDTO> getArticles(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<AdminArticleDTO> articles = adminArticleDao.listArticles();
        return new PageInfo<>(articles);
    }

    @Override
    public Article getArticleById(int id) {
        Article article = adminArticleDao.getArticleById(id);
        return article;
    }

    @Override
    public boolean deleteArticleById(int id) {
        return adminArticleDao.deleteArticleById(id);
    }


}
