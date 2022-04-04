package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/1 20:14
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallBackService.class)
public interface PaymentService {

  @GetMapping("/payment/{id}")
  CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
