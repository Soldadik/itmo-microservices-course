package com.payment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/api/p/orders")
//@RequestMapping(value = "/order-service")
//@RequestMapping(value = "/api/")
public class OrderServiceController
{
    @Autowired
    private OrderServiceProxy orderServiceProxy;

    //@GetMapping("/orders/{order_ID}")
    @RequestMapping(value = "/api/orders/{order_ID}", method = RequestMethod.GET)
    public OrderResponse getOrderByID(@PathVariable("order_ID") long order_id)
    {
        OrderResponse response = orderServiceProxy.getOrderByID(order_id);
        return response;
    }
}
