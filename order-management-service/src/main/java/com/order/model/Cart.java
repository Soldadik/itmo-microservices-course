package com.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart
{
    @Id
    @GeneratedValue
    long cart_ID;
    long order_ID;
    //List<ItemDto> items;
}
