package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entity.CommonResult;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/1 11:28
 */
public class CustomerBlockHandler {
  public static CommonResult handlerException(BlockException exception) {
    return new CommonResult(444, "按客户自定义, global handlerException---11111");
  }

  public static CommonResult handlerException2(BlockException exception) {
    return new CommonResult(444, "按客户自定义, global handlerException----22222");
  }
}
