package io.seata.demo.storage.dao;

import io.seata.demo.storage.domain.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StorageOracleMapper {

    @Update("update STORAGE set USED = USED + #{count,jdbcType=NUMERIC}, RESIDUE = RESIDUE - #{count,jdbcType=NUMERIC}" +
            " where PRODUCT_ID = #{productId,jdbcType=NUMERIC} AND ID = #{id,jdbcType=VARCHAR}")
    int updateOracleSuccess(Orders order);
}
