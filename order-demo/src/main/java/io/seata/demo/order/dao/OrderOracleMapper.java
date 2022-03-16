package io.seata.demo.order.dao;

import io.seata.demo.order.domain.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OrderOracleMapper {

    @Insert("insert into ORDERS (ID,PRODUCT_ID,COUNT,PAY_AMOUNT,ADDRESS) values " +
            "(#{id,jdbcType=VARCHAR},order_seq.nextval,#{count,jdbcType=NUMERIC},#{payAmount,jdbcType=NUMERIC},#{address,jdbcType=VARCHAR})")
    int insertOracleSuccess(Orders order);

    @Update("update ORDERS set COUNT = COUNT + 1 where product_id = #{productId,jdbcType=VARCHAR}")
    int updateOracleSuccess(Orders order);


    @Delete("delete from ORDERS where product_id = #{productId,jdbcType=NUMERIC}")
    int deleteOracleSuccess(Orders order);
}
