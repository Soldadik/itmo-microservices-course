package com.order.feign;

import com.order.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="catalog-service")
public interface OrderClient
{
    @RequestMapping("/catalog/api/carts/{cart_id}")
    public Order getOrderByID(@PathVariable(value="cart_id") long cart_id);
}
