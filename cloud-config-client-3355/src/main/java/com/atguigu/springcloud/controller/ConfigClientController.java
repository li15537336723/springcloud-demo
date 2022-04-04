package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/28 9:39
 */
@RestController
@RefreshScope
public class ConfigClientController {

  @Value("${config.info}")
  private String configInfo;

  @GetMapping("/configInfo")
  public String getConfigInfo(){
    return configInfo;
  }
}
