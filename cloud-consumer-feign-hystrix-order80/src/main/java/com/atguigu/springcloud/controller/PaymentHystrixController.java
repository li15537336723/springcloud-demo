package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/22 15:31
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class PaymentHystrixController {

  @Resource
  private PaymentHystrixService paymentHystrixService;

  @GetMapping("/consumer/payment/hystrix/ok/{id}")
  public String paymentInfo_OK(@PathVariable("id") Integer id){
    return paymentHystrixService.paymentInfo_OK(id);
  }

  @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//  @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//          @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//  })
  @HystrixCommand
  public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
    int a = 1 / 0;
    return paymentHystrixService.paymentInfo_TimeOut(id);
  }

  public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
    return "I'm consumer 80, side is busy, please again second";
  }

  // 下面是全部 fallback
  public String payment_Global_FallbackMethod (){
    return "Global异常信息处理，请稍后再试";
  }

}
