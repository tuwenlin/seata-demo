package io.seata.demo.order.service;

import io.seata.demo.order.domain.Orders;

public interface OrderService {

    void insertSuccessOracle(Orders order);

    void insertFailOracle(Orders orders);

    void updateSuccessOracle(Orders order);

    void deleteSuccessOracle(Orders order);

    void insertSuccessPG(Orders order);

    void insertFailPG(Orders orders);

    void updateSuccessPG(Orders order);

    void deleteSuccessPG(Orders order);
}
