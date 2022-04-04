package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/12 9:40
 */
@Configuration
public class MySelfRule {
  @Bean
  public IRule myRule() {
    return new RandomRule();  // 定义为随机
  }
}
