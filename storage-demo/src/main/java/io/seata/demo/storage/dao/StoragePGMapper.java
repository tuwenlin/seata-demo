package io.seata.demo.storage.dao;


import io.seata.demo.storage.domain.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StoragePGMapper {

    @Update("update storage set used = used + #{count,jdbcType=NUMERIC},residue = residue - #{count,jdbcType=NUMERIC}" +
            " where id = #{id,jdbcType=VARCHAR} and product_id = #{productId,jdbcType=NUMERIC}")
    int updatePGSuccess(Orders order);

}
