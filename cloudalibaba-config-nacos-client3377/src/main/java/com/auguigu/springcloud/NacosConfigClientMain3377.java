package com.auguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/30 10:05
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
  public static void main(String[] args) {
    SpringApplication.run(NacosConfigClientMain3377.class, args);
  }
}
