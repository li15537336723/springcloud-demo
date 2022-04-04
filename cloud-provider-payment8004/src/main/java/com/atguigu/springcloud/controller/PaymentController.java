package com.atguigu.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/2/17 14:54
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @RequestMapping("/payment/zk")
  public String paymentzk(){
    return "springCloud——" + serverPort + UUID.randomUUID().toString();
  }
}
