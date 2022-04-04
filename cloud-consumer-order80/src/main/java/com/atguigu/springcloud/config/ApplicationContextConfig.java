package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/13 18:28
 */
@Configuration
public class ApplicationContextConfig {
  @Bean
//  @LoadBalanced //的 开启负载均衡机制  使用此注解赋予 RestTemplate 负载均衡能力
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
