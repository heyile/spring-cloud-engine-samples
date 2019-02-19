package com.configserver.democonfigeureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope // 允许动态刷新配置
@RestController
@Configuration
public class ConfigClientController {

  @Value("${hello.rkd:error}")
  private String name;

  @RequestMapping("/hello")
  public String version() {
    return this.name;
  }
}
