package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/29 8:48
 */
@RestController
public class ConfigClientController {
  @Value("${server.port}")
  private String serverPort;

  @Value("${config.info}")
  private String configInfo;

  @GetMapping("/configInfo")
  public String configInfo() {
    return "serverPort: " + serverPort + "\t\n\n configInfo: " + configInfo;
  }
}
