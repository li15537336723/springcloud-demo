package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/31 8:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {
  public static void main(String[] args) {
    SpringApplication.run(MainApp8401.class, args);
  }
}
