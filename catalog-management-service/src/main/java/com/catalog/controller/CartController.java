package com.catalog.controller;

import com.catalog.exception.ResourceNotFoundException;
import com.catalog.model.Cart;
import com.catalog.model.Item;
import com.catalog.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/catalog/carts")
public class CartController
{
    @Autowired
    private CartRepository cartRepository;

    //Update cart
    @PutMapping("{cart_ID}")
    //public ResponseEntity<Cart> updateCart(@PathVariable("cart_ID") long cart_ID, @Valid @RequestBody Cart cartDetails) throws ResourceNotFoundException
    public ResponseEntity<Cart> updateCart(@PathVariable("cart_ID") long cart_ID) throws ResourceNotFoundException
    {
        Cart cart = cartRepository.findById(cart_ID)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found on :: " + cart_ID));
        cart.setCart_ID(cart_ID);
        final Cart updatedCart = cartRepository.save(cart);
        return ResponseEntity.ok(updatedCart);
    }

}
