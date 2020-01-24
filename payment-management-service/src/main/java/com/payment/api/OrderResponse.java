package com.payment.api;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderResponse
{
    @Id
    private long order_id;
    private long cart_id;
    private OrderStatus status;
    private double total_cost;
    private String address;

    public OrderResponse() {}

    public OrderResponse(long order_id, long cart_id, OrderStatus status, double total_cost, String address)
    {
        super();
        this.order_id = order_id;
        this.cart_id = cart_id;
        this.status = status;
        this.total_cost = total_cost;
        this.address = address;
    }

    public long getOrder_id()
    {
        return order_id;
    }

    public void setOrder_id(long order_id)
    {
        this.order_id = order_id;
    }

    public long getCart_id()
    {
        return cart_id;
    }

    public void setCart_id(long cart_id)
    {
        this.cart_id = cart_id;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public double getTotal_cost()
    {
        return total_cost;
    }

    public void setTotal_cost(double total_cost)
    {
        this.total_cost = total_cost;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}

enum OrderStatus
{
    COLLECTING,
    PAID,
    SHIPPING,
    COMPLETE,
    FAILED,
    CANCELLED
}
