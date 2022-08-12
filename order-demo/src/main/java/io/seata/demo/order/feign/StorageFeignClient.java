package io.seata.demo.order.feign;

import io.seata.demo.order.domain.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("storage")
public interface StorageFeignClient {

    @PostMapping("/storage/update/oracle/success")
    String updateStorageOracleSuccess(@RequestBody Orders orders);

    @PostMapping("/storage/update/oracle/fail")
    String updateStorageOracleFail(@RequestBody Orders orders);

    @PostMapping("/storage/update/pg/success")
    String updateStoragePGSuccess(@RequestBody Orders orders);

    @PostMapping("/storage/update/pg/fail")
    String updateStoragePGFail(@RequestBody Orders orders);
}
