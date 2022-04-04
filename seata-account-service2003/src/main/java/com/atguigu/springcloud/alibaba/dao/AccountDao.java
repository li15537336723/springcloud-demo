package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * description:
 *
 * @author: lixianghong
 * @date: 2022/4/4 8:53
 */
@Mapper
public interface AccountDao {

//  @Update("UPDATE t_account SET residue = residue - #{money},used = used + #{money}\n" +
//          "WHERE user_id = #{userId};")
  void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
