package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/1 15:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9004 {
  public static void main(String[] args) {
    SpringApplication.run(Payment9004.class, args);
  }
}
