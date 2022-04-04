package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/2 15:13
 */
@Mapper
public interface OrderDao {

  // 新建订单
  void create(Order order);

  // 修改订单状态 ，从 0 到 1
//  @Update("update t_order set status = 1 where user_id = #{userId} and status = 0")
  void update(@Param("userId") Long userId, @Param("status") Integer status);

}
