package com.order.api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CatalogResponse
{
    @Id
    private long cart_detail_id;
    private long cart_id;
    private long item_id;
    private int amount;

    public CatalogResponse() {}

    public CatalogResponse(long cart_detail_id, long cart_id, long item_id, int amount)
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
