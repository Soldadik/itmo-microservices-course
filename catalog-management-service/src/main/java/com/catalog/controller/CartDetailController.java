package com.catalog.controller;

import com.catalog.exception.ResourceNotFoundException;
import com.catalog.model.CartDetail;
import com.catalog.repository.CartDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RefreshScope
@RestController
@RequestMapping("/api/catalog/carts")
public class CartDetailController
{
    @Autowired
    private CartDetailRepository cartDetailRepository;

    //Get by ID
    @GetMapping("/detail/{cart_ID}")
    public ResponseEntity<List<CartDetail>> getCartDetailByID(@PathVariable("cart_ID") long cart_ID) throws ResourceNotFoundException
    {
        List<CartDetail> cart = cartDetailRepository.findAllById(Collections.singleton(cart_ID));
              //  .orElseThrow(() -> new ResourceNotFoundException("Cart not found on :: " + cart_ID));
        return ResponseEntity.ok(cart);
    }

    // /{cart_id}
    // @PostMapping
    //    public Item createItem(@Valid @RequestBody Item item)
    //    {
    //        return itemRepository.save(item);
    //    }

    //Add to cart
    /*@PostMapping
    public CartDetail addToCart()
    {

    }

    //Remove from cart
    public CartDetail removeFromCart()
    {

    }
    */
    // /{cart_id}
}