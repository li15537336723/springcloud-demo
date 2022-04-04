package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/13 19:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

  private Integer code;

  private String message;

  private T data;

  public CommonResult(Integer code, String message){
    this(code, message, null);
  }

}
