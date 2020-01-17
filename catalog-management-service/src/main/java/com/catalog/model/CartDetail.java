package com.catalog.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "cartDetail")
public class CartDetail
{
    @Id
    @Column(name = "cart_detail_id")
    private long cart_detail_id;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
    private long cart_id;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    private long item_id;

    @NotBlank
    @Column(name = "amount")
    private double amount;

    public CartDetail() {}

    public CartDetail(long cart_detail_id, long cart_id, long item_id, double amount)
    {
        super();
        this.cart_detail_id = cart_detail_id;
        this.cart_id = cart_id;
        this.item_id = item_id;
        this.amount = amount;
    }

    public long getCart_detail_id()
    {
        return cart_detail_id;
    }

    public void setCart_detail_id(long cart_detail_id)
    {
        this.cart_detail_id = cart_detail_id;
    }

    public long getCart_id()
    {
        return cart_id;
    }

    public void setCart_id(long cart_id)
    {
        this.cart_id = cart_id;
    }

    public long getItem_id()
    {
        return item_id;
    }

    public void setItem_id(long item_id)
    {
        this.item_id = item_id;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
}

