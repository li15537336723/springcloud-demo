package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/2 15:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

  private Integer code;

  private String message;

  private T data;

  public CommonResult(Integer code, String message) {
    this(code, message, null);
  }

}
