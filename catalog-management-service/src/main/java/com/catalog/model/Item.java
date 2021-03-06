package com.catalog.model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item
{
    @Id
    @Column(name = "item_id")
    private long item_ID;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private double price;

    public Item() {}

    public Item(long item_ID, String name, int amount, double price)
    {
        super();
        this.item_ID = item_ID;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public long getItem_ID()
    {
        return item_ID;
    }

    public void setItem_ID(long item_ID)
    {
        this.item_ID = item_ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
