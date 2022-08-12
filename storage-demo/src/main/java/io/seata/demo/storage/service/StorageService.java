package io.seata.demo.storage.service;


import io.seata.demo.storage.domain.Orders;

public interface StorageService {

    void updateSuccessOracle(Orders order);

    void updateFailOracle(Orders order);

    void updateSuccessPG(Orders orders);

    void updateStoragePGFail(Orders orders);
}
