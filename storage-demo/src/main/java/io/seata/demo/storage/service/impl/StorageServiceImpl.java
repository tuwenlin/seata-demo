package io.seata.demo.storage.service.impl;


import io.seata.demo.storage.dao.StorageOracleMapper;
import io.seata.demo.storage.dao.StoragePGMapper;
import io.seata.demo.storage.domain.Orders;
import io.seata.demo.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    public StorageOracleMapper storageOracleMapper;

    @Autowired
    public StoragePGMapper storagePGMapper;

    @Autowired
    public StoragePGMapper orderPGMapper;


    @Override
    public void updateSuccessOracle(Orders order) {
        storageOracleMapper.updateOracleSuccess(order);
    }

    @Override
    public void updateFailOracle(Orders order) {
        storageOracleMapper.updateOracleSuccess(order);
    }

    @Override
    public void updateSuccessPG(Orders orders) {
        orderPGMapper.updatePGSuccess(orders);
    }

    @Override
    public void updateStoragePGFail(Orders orders) {
        orderPGMapper.updatePGSuccess(orders);
    }
}
