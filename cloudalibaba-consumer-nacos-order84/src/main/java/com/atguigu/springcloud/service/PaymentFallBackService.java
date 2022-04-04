package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/1 20:16
 */
@Component
public class PaymentFallBackService implements PaymentService {
  @Override
  public CommonResult<Payment> paymentSQL(Long id) {
    return new CommonResult<>(444, "服务降级，  --PaymentfalbackService", new Payment(id, "errorService"));
  }
}
