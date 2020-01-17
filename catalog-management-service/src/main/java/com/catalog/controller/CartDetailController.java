package com.catalog.controller;

import com.catalog.model.CartDetail;
import com.catalog.repository.CartDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalog/carts")
public class CartDetailController
{
    @Autowired
    private CartDetailRepository cartDetailRepository;

    // /{cart_id}
    // @PostMapping
    //    public Item createItem(@Valid @RequestBody Item item)
    //    {
    //        return itemRepository.save(item);
    //    }

    //Add to cart
    @PutMapping
    public CartDetail addToCart()
    {

    }

    //Remove from cart
    public CartDetail removeFromCart()
    {

    }
    // /{cart_id}

}