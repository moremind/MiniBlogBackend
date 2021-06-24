package cn.simplethinking.miniblogapp.admin.service.impl;

import cn.simplethinking.miniblogapp.admin.dao.AdminCategoryDao;
import cn.simplethinking.miniblogapp.admin.service.AdminCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 管理员分类服务
 * @see
 * @since 1.0.0
 */
@Service
public class AdminCategoryServiceImpl implements AdminCategoryService {

    @Autowired
    AdminCategoryDao adminCategoryDao;
}
