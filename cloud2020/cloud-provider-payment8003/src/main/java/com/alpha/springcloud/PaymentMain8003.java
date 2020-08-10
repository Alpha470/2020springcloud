package com.alpha.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther zzyy
 * @create 2020-02-17 21:13
 */

@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8003
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8003.class, args);

    }
}
