package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/2 17:05
 */
@Mapper
public interface StorageDao {
  //扣减库存
//  @Update("PDATE t_storage SET used = used + #{count},residue = residue - #{count}\n" +
//          " WHERE product_id = #{productId}" )
  void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
