package cn.simplethinking.miniblogapp.admin.initialize;

import cn.hutool.crypto.SecureUtil;
import cn.simplethinking.miniblogapp.admin.entity.Admin;
import cn.simplethinking.miniblogapp.miniapp.controller.WeChatUserController;
import cn.simplethinking.miniblogapp.admin.dao.AdminUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description SpringBoot应用启动后在数据库中插入对应的管理员账号
 * @see Admin
 * @since 1.0.0
 */
@Component
@Order(value = 2)
public class AdminInitializer implements ApplicationRunner {
    Logger logger = LoggerFactory.getLogger(WeChatUserController.class);

    private static final String DEFAULT_ADMIN_NAME = "admin";

    private static final String DEFAULT_ADMIN_PASSWORD = "admin123";

    @Autowired
    AdminUserDao adminUserDao;

    @Override
    public void run(ApplicationArguments args) {
        logger.info("==================** init admin start **==================");
        Admin admin = new Admin();
        admin.setUsername(DEFAULT_ADMIN_NAME);
        admin.setPassword(SecureUtil.md5(DEFAULT_ADMIN_PASSWORD));
        adminUserDao.insertAdmin(admin);
        logger.info("==================** init admin end **==================");
    }
}
