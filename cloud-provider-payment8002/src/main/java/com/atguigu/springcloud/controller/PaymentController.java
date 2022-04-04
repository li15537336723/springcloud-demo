package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/8 16:28
 */
@RestController
@Slf4j
public class PaymentController {

  @Resource
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @PostMapping(value = "/payment/create")
  public CommonResult<Integer> create(@RequestBody Payment payment) {
    int result = paymentService.create(payment);
    log.info("***插入结果：" + result);
    if (result > 0) {
      return new CommonResult<>(200, "插入数据库成功, server.port:" + serverPort, result);
    } else {
      return new CommonResult<>(444, "插入数据库失败" , null);
    }
  }

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Object> getPayment(@PathVariable Long id) {
    Payment payment = paymentService.getPaymentById(id);
    log.info("***查询结果：" + payment);
    if (payment != null) {
      return new CommonResult<>(200, "查询成功, server.port:"+ serverPort, payment);
    } else {
      return new CommonResult<>(444, "没有对应记录", null);
    }
  }

  @GetMapping("/payment/lb")
  public String getPaymentByLB(){
    return serverPort;
  }


}
