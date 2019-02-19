package com.huawei.springcloud.engine.demoengineprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoEngineProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEngineProviderApplication.class, args);
    }

}

