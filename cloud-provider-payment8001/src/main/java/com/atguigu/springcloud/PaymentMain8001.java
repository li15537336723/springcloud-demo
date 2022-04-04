package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/8 12:19
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8001.class, args);
  }
}
