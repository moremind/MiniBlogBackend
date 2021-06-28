package cn.simplethinking.miniblogapp.system.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean(value = "restTemplate")
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
