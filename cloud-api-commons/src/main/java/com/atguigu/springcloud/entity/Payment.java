package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/13 19:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

  private Long id;

  private String serial;

}

