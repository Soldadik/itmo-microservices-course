package com.catalog.model;

import javax.persistence.*;

@Entity
@Table(name = "cart_detail")
public class CartDetail
{
    @Column(name = "cart_detail_id")
    private long cart_detail_id;

    @Id
    @Column(name = "cart_id")
    private long cart_id;

    @Column(name = "item_id")
    private long item_id;

    @Column(name = "amount")
    private int amount;

    public CartDetail() {}

    public CartDetail(long cart_detail_id, long cart_id, long item_id, int amount)
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

    public void setAmount(int amount)
    {
        this.amount = amount;
    }
}

