package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/21 10:16
 */
public interface LoadBalancer {

  ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}
