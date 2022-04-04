package com.atguigu.springcloud.alibaba;

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
 * @date: 2022/4/4 9:09
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan({
        "com.atguigu.springcloud.alibaba.dao"
})
public class SeataOrderMain2003 {
  public static void main(String[] args) {
    SpringApplication.run(SeataOrderMain2003.class, args);
  }
}
