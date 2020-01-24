package com.payment.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="order-service")
public interface OrderServiceProxy //extends JpaRepository<OrderResponse, Long>
{
    //@GetMapping("/api/orders/{order_ID}")
    @RequestMapping(value = "/api/orders/{order_ID}", method = RequestMethod.GET)
    OrderResponse getOrderByID(@PathVariable long order_id);
}
