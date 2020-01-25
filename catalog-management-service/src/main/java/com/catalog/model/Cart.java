package com.catalog.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart
{
    @Id
    @Column(name = "cart_id")
    private long cart_ID;

    public Cart() { }

    public Cart(long cart_ID)
    {
        super();
        this.cart_ID = cart_ID;
    }

    public long getCart_ID()
    {
        return cart_ID;
    }

    public void setCart_ID(long cart_ID)
    {
        this.cart_ID = cart_ID;
    }

}
