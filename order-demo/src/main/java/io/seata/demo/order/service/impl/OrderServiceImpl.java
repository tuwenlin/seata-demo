package io.seata.demo.order.service.impl;

import io.seata.demo.order.dao.OrderOracleMapper;
import io.seata.demo.order.dao.OrderPGMapper;
import io.seata.demo.order.domain.Orders;
import io.seata.demo.order.feign.StorageFeignClient;
import io.seata.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    public OrderOracleMapper orderOracleMapper;

    @Autowired
    public OrderPGMapper orderPGMapper;

    @Autowired
    public StorageFeignClient storageFeignClient;


    @Override
    public void insertSuccessOracle(Orders order) {
        orderOracleMapper.insertOracleSuccess(order);
        storageFeignClient.updateStorageOracleSuccess(order);
    }

    @Override
    public void insertFailOracle(Orders orders) {
        orderOracleMapper.insertOracleSuccess(orders);
        storageFeignClient.updateStorageOracleFail(orders);
    }

    @Override
    public void updateSuccessOracle(Orders order) {
        orderOracleMapper.updateOracleSuccess(order);
    }

    @Override
    public void deleteSuccessOracle(Orders order) {
        orderOracleMapper.deleteOracleSuccess(order);
    }

    @Override
    public void insertSuccessPG(Orders order) {
        orderPGMapper.insertPGSuccess(order);
        storageFeignClient.updateStoragePGSuccess(order);
    }

    @Override
    public void insertFailPG(Orders orders) {
        orderPGMapper.insertPGSuccess(orders);
        storageFeignClient.updateStoragePGFail(orders);
    }

    @Override
    public void updateSuccessPG(Orders order) {
        orderPGMapper.updatePGSuccess(order);
    }

    @Override
    public void deleteSuccessPG(Orders order) {
        orderPGMapper.deletePGSuccess(order);
    }
}
