package com.huawei.springcloud.engine.demoengineconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("default-eureka-provider")
public interface HelloWorldIntf {

  @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
  String sayHello();

}
