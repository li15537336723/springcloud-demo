package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/4 8:49
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
