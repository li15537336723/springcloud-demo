package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/2/17 16:44
 */
@RestController
@Slf4j
public class OrderZKController {

  private static final String INVOKE_URL = "http://cloud-provider-payment";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/zk")
  public String paymentInfo(){
    return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
  }

}
