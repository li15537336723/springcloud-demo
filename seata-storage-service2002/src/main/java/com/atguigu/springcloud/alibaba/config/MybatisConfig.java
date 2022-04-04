package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/2 16:02
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MybatisConfig {

}
