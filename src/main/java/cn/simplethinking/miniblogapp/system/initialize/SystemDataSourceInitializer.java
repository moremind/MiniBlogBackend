package cn.simplethinking.miniblogapp.system.initialize;

import cn.simplethinking.miniblogapp.miniapp.controller.WeChatUserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 应用程序启动初始化数据库
 * @see
 * @since 1.0.0
 */
@Order(value = 1)
@Component
public class SystemDataSourceInitializer implements ApplicationRunner {
    Logger logger = LoggerFactory.getLogger(WeChatUserController.class);


    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("==================** init sql **==================");
    }
}
