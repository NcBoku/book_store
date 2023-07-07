package core.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public org.springframework.web.client.RestTemplate initRestTemplate() {
        return new org.springframework.web.client.RestTemplate();
    }
}
