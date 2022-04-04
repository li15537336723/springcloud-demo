package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/2 16:04
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan({
        "com.atguigu.springcloud.alibaba.dao"
})
public class SeataOrderMainApp2001 {
  public static void main(String[] args) {
    SpringApplication.run(SeataOrderMainApp2001.class, args);
  }
}
