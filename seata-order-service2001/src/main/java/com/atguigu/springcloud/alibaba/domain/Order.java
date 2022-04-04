package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/2 15:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
  private Long id;

  private Long userId;

  private Long productId;

  private Integer count;

  private BigDecimal money;

  private Integer status; //订单状态：0：创建中；1：已完结
}
