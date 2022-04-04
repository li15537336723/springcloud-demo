package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/4 9:04
 */
@RestController
public class AccountController {

  @Resource
  AccountService accountService;

  @RequestMapping("/account/decrease")
  public CommonResult decrease(Long userId, BigDecimal money) {
    accountService.decrease(userId, money);
    return new CommonResult(200, "扣减账户余额成功");
  }
}
