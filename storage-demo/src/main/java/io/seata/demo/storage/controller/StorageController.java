package io.seata.demo.storage.controller;

import io.seata.demo.storage.domain.Orders;
import io.seata.demo.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/update/oracle/success")
    public String updateStorageOracleSuccess(@RequestBody Orders orders) {
        storageService.updateSuccessOracle(orders);
        return "success";
    }

    @PostMapping("/update/oracle/fail")
    public String updateStorageOracleFail(@RequestBody Orders orders) {
        storageService.updateFailOracle(orders);
        int i = 1 / 0;
        return "success";
    }

    @PostMapping("/update/pg/success")
    public String updateStoragePGSuccess(@RequestBody Orders orders) {
        storageService.updateSuccessPG(orders);
        return "success";
    }

    @PostMapping("/update/pg/fail")
    String updateStoragePGFail(@RequestBody Orders orders){
        storageService.updateStoragePGFail(orders);
        int i = 1 / 0;
        return "success";
    }


}
