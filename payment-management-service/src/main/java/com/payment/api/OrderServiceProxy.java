package com.payment.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="order-service")
public interface OrderServiceProxy
{
    @RequestMapping(value = "/api/orders/{order_ID}", method = RequestMethod.GET)
    OrderResponse getOrderByID(@PathVariable(value = "order_ID") long order_id);
}
