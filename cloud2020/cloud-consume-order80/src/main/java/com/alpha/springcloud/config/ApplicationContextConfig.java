package com.alpha.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced   //默认的轮询算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
