package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/3/29 14:57
 */
@RestController
public class SendMessageController {
  @Resource
  private IMessageProvider messageProvider;

  @GetMapping("sendMessage")
  public String sendMessage() {
    return messageProvider.send();
  }
}
