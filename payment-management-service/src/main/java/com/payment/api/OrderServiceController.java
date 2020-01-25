package com.payment.api;

import com.payment.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "/api")
public class OrderServiceController
{
    @Autowired
    private OrderServiceProxy orderServiceProxy;

    public OrderServiceController(OrderServiceProxy orderServiceProxy)
    {
        this.orderServiceProxy = orderServiceProxy;
    }

    @RequestMapping(value = "/orders/{order_ID}", method = RequestMethod.GET)
    public ResponseEntity<OrderResponse> getOrderByID(@PathVariable("order_ID") long order_id) throws ResourceNotFoundException
    {
        OrderResponse response = orderServiceProxy.getOrderByID(order_id);
        return ResponseEntity.ok(response);
    }
}
