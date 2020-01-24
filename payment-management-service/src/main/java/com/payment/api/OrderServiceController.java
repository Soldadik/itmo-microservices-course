package com.payment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;

@RestController
@RequestMapping(value="/api/p/orders")
@Service
@Lazy
//@ComponentScan("com.payment.api.OrderServiceProxy")
@Transactional
public class OrderServiceController implements OrderServiceProxy
{

    private RestTemplate restTemplate;


    private OrderServiceProxy orderServiceProxy1;

    @Autowired
    @GetMapping("{order_ID}")
    public OrderResponse getOrderByID(@PathVariable("order_ID") long order_id)
    {
        OrderResponse response = orderServiceProxy1.getOrderByID(order_id);
        return response;
    }
}
