package com.payment.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="order-service")
@RequestMapping("/api/orders/{order_ID}")
@Repository
@Component
public interface OrderServiceProxy //extends JpaRepository<OrderResponse, Long>
{
    @GetMapping
    OrderResponse getOrderByID(long order_id);
}
