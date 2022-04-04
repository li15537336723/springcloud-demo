package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/23 16:57
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboardMain9001.class, args);
  }
}
