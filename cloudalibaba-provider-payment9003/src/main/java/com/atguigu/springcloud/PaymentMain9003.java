package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/1 15:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain9003.class, args);
  }
}
