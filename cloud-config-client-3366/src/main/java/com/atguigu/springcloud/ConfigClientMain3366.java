package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/29 8:47
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientMain3366.class, args);
  }
}
