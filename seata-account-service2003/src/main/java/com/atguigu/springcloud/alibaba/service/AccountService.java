package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/4 8:55
 */
public interface AccountService {

  void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
