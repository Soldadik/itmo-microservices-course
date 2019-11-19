package com.catalog.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name = "items")
public class Item
{
    @Id
    @GeneratedValue
    private UUID item_ID;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "amount")
    private int amount;

    @NotBlank
    @Column(name = "price")
    private double price;

    public Item(UUID item_ID, @NotBlank String name, @NotBlank int amount, @NotBlank double price)
    {
        this.item_ID = item_ID;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public UUID getItem_ID()
    {
        return item_ID;
    }

    public void setItem_ID(UUID item_ID)
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
