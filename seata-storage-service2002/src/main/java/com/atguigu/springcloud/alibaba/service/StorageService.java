package com.atguigu.springcloud.alibaba.service;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/2 17:06
 */
public interface StorageService {
  void decrease(Long productId, Integer count);
}
