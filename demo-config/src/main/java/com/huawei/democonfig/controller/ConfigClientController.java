package com.huawei.democonfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

  @Value("${hello.rkd:error}")
  private String name;

  @RequestMapping("/hello")
  public String version() {
    return this.name;
  }

}
