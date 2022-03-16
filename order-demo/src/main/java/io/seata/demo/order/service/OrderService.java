package io.seata.demo.order.service;

import io.seata.demo.order.domain.Orders;

public interface OrderService {

    void insertSuccessOracle(Orders order);

    void updateSuccessOracle(Orders order);

    void deleteSuccessOracle(Orders order);

    void insertSuccessPG(Orders order);

    void updateSuccessPG(Orders order);

    void deleteSuccessPG(Orders order);
}
