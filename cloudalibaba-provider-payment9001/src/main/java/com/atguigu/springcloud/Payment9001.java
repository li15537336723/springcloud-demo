package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/30 9:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9001 {
  public static void main(String[] args) {
    SpringApplication.run(Payment9001.class, args);
  }
}
