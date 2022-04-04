package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/21 10:17
 */
@Component
public class MyLB implements LoadBalancer{







  @Override
  public ServiceInstance instance(List<ServiceInstance> serviceInstanceList) {
    return null;
  }
}
