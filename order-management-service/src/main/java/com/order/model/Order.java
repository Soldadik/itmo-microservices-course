package com.order.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue
    private UUID order_ID;

    @NotBlank
    @Column(name = "status")
    private OrderStatus status;

    @NotBlank
    @Column(name = "total_cost")
    private double totalCost;

    @NotBlank
    @Column(name = "address")
    private String address;
    //int cartID;

    public Order() {}

    public Order(UUID order_ID, @NotBlank OrderStatus status, @NotBlank double totalCost, @NotBlank String address)
    {
        super();
        this.order_ID = order_ID;
        this.status = status;
        this.totalCost = totalCost;
        this.address = address;
    }

    public UUID getOrder_ID()
    {
        return order_ID;
    }

    public void setOrder_ID(UUID order_ID)
    {
        this.order_ID = order_ID;
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
