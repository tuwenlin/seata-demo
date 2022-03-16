package io.seata.demo.order.service.impl;

import io.seata.demo.order.dao.OrderOracleMapper;
import io.seata.demo.order.dao.OrderPGMapper;
import io.seata.demo.order.domain.Orders;
import io.seata.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    public OrderOracleMapper orderOracleMapper;

    @Autowired
    public OrderPGMapper orderPGMapper;


    @Override
    public void insertSuccessOracle(Orders order) {
        orderOracleMapper.insertOracleSuccess(order);
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
