package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entity.Payment;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/8 16:25
 */
public interface PaymentService {

  int create(Payment payment);

  Payment getPaymentById(Long id);
}
