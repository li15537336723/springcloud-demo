package com.atguitu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/24 16:03
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
  public static void main(String[] args) {
    SpringApplication.run(GateWayMain9527.class, args);
  }
}
