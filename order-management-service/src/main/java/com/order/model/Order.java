package com.order.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @Column(name = "order_id")
    private long order_ID;

    @NotBlank
    @Column(name = "cart_id")
    private long cart_ID;

    @NotBlank
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @NotBlank
    @Column(name = "total_cost")
    private double totalCost;

    @NotBlank
    @Column(name = "address")
    private String address;

    public Order() {}

    public Order(long order_ID, @NotBlank long cart_ID, @NotBlank OrderStatus status, @NotBlank double totalCost, @NotBlank String address)
    {
        super();
        this.order_ID = order_ID;
        this.cart_ID = cart_ID;
        this.status = status;
        this.totalCost = totalCost;
        this.address = address;
    }

    public long getOrder_ID()
    {
        return order_ID;
    }

    public void setOrder_ID(long order_ID)
    {
        this.order_ID = order_ID;
    }

    public long getCart_ID()
    {
        return cart_ID;
    }

    public void setCart_ID(long cart_ID)
    {
        this.cart_ID = cart_ID;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
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
