package cn.simplethinking.miniblogapp.system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */

@Configuration
@PropertySource(value = "classpath:config/gitee.properties")
//@ConfigurationProperties(prefix = "gitee")
public class GiteeFileConfiguration {

    @Value("${gitee.access_token}")
    public String ACCESS_TOKEN;

    @Value("${gitee.owner}")
    public String owner;

    @Value("${gitee.repository}")
    public String repository;

    @Value("${gitee.path}")
    public String path;

    public static final String UPLOAD_MESSAGE = "upload file";

    public static final String DELETE_MESSAGE = "delete file";

    public String getACCESS_TOKEN() {
        return ACCESS_TOKEN;
    }

    public void setACCESS_TOKEN(String ACCESS_TOKEN) {
        this.ACCESS_TOKEN = ACCESS_TOKEN;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
