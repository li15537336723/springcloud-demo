package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/23 10:02
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
  @Override
  public String paymentInfo_OK(Integer id) {
    return "---PaymentFallbackService fall back - paymentInfo_OK";
  }

  @Override
  public String paymentInfo_TimeOut(Integer id) {
    return "---PaymentFallbackService fall back - paymentInfo_TimeOut";
  }
}
