package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/14 18:23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7001.class, args);
  }
}
