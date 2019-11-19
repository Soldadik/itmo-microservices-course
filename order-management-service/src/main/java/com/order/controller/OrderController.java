package com.order.controller;

import com.order.exception.ResourceNotFoundException;
import com.order.model.Order;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/orders/")
public class OrderController
{
    @Autowired
    private OrderRepository orderRepository;

    //Get all orders
    @GetMapping
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    //Get order by ID
    @GetMapping("{order_ID}")
    public ResponseEntity<Order> getOrderByID(@PathVariable("order_ID") long order_ID) throws ResourceNotFoundException
    {
        Order order = orderRepository.findById(order_ID).
                orElseThrow(() -> new ResourceNotFoundException("Order not found on :: " + order_ID));
        return ResponseEntity.ok().body(order);
    }

    //Update order
    @PutMapping("{order_ID}")
    public ResponseEntity<Order> updateOrder(@PathVariable("order_ID") long order_ID, @Valid @RequestBody Order orderDetails) throws ResourceNotFoundException
    {
        Order order = orderRepository.findById(order_ID)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found on :: " + order_ID));
        order.setStatus(orderDetails.getStatus());
        order.setTotalCost(orderDetails.getTotalCost());
        order.setAddress(orderDetails.getAddress());
        final Order updatedOrder = orderRepository.save(order);
        return ResponseEntity.ok(updatedOrder);
    }

    //Add order
    @PostMapping
    public Order createOrder(@Valid @RequestBody Order order)
    {
        return orderRepository.save(order);
    }


}