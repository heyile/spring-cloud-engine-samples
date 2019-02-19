package com.huawei.springcloud.engine.demoengineprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaSampleController {

  @Value("${server.port}")
  String port;

  @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
  public String hello(){
    return "hello, huawei. There is cse with port : " + port ;
  }
}
