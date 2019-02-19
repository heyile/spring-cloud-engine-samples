package com.huawei.springcloud.engine.demoengineconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class DemoEngineConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEngineConsumerApplication.class, args);
    }
}

