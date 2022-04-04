package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/21 10:48
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

  @GetMapping("/payment/get/{id}")
  CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

  @GetMapping("/payment/feign/timeout")
  String paymentFeignTimeout();

}
