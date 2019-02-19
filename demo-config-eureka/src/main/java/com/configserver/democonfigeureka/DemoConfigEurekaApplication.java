package com.configserver.democonfigeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoConfigEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigEurekaApplication.class, args);
    }

}
