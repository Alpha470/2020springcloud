package com.alpha.myrule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    @LoadBalanced
    public RandomRule getRestTemplate(){
        return new RandomRule();
    }
}
