package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**d
 * description:
 *
 * @author: lixianghong
 * @date: 2022/1/8 16:18
 */
@Mapper
public interface PaymentDao {

  @Insert("insert into payment(serial) value (#{serial})")
  int create(Payment payment);

  @Select("select id, serial from payment where id = #{id}")
  Payment getPaymentById(Long id);

}
