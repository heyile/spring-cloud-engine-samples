package com.huawei.springcloud.engine.demoengineconsumer.controller;

import com.huawei.springcloud.engine.demoengineconsumer.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerSampleController {
    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return helloWorldService.sayHello();
    }
}
