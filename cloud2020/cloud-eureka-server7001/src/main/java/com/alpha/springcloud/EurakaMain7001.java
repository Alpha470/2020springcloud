package com.alpha.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurakaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurakaMain7001.class,args);
    }
}
