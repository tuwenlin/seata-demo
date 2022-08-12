package io.seata.demo.order.dao;

import io.seata.demo.order.domain.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OrderPGMapper {

    @Insert("insert into orders (id,seq,count,product_id,address) values " +
            "(#{id,jdbcType=VARCHAR},nextval('orders_seq'),DEFAULT,#{productId,jdbcType=NUMERIC},#{address,jdbcType=VARCHAR})")
    int insertPGSuccess(Orders order);

    @Update("update orders set pay_amount = pay_amount + 1 where count = #{count,jdbcType=NUMERIC}")
    int updatePGSuccess(Orders order);


    @Delete("delete from orders where count = #{count,jdbcType=NUMERIC}")
    int deletePGSuccess(Orders order);
}
