package io.seata.demo.order.controller;

import io.seata.demo.order.domain.Orders;
import io.seata.demo.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pgsql")
public class OraclePostgreSqlController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/insert/success")
    @GlobalTransactional
    public String insertOrderSuccess(@RequestBody Orders orders) {
        orderService.insertSuccessPG(orders);
//        int i = 1 / 0;
        return "success";
    }

    @PostMapping("/update/success")
    @GlobalTransactional
    public String updateOrderSuccess(@RequestBody Orders orders) {
        orderService.updateSuccessPG(orders);
        int i = 1 / 0;
        return "success";
    }

    @PostMapping("/delete/success")
    @GlobalTransactional
    public String deleteOrderSuccess(@RequestBody Orders orders) {
        orderService.deleteSuccessPG(orders);
        int i = 1 / 0;
        return "success";
    }

}
