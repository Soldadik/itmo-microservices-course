package com.catalog.controller;

import com.catalog.exception.ResourceNotFoundException;
import com.catalog.model.Item;
import com.catalog.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RefreshScope
@RestController
@RequestMapping("/api/catalog/items/")
public class ItemController
{
    @Autowired
    private ItemRepository itemRepository;

    //Get items
    @GetMapping
    public List<Item> getItems()
    {
        return itemRepository.findAll();
    }

    //Get item by ID
    @GetMapping("{item_ID}")
    public ResponseEntity<Item> getItemByID(@PathVariable("item_ID") long item_ID) throws ResourceNotFoundException
    {
        Item item = itemRepository.findById(item_ID).
                orElseThrow(() -> new ResourceNotFoundException("Item not found on :: " + item_ID));
        return ResponseEntity.ok().body(item);
    }

    //Update item
    @PutMapping("{item_ID}")
    public ResponseEntity<Item> updateItem(@PathVariable("item_ID") long item_ID, @Valid @RequestBody Item ItemDetails) throws ResourceNotFoundException
    {
        Item item = itemRepository.findById(item_ID)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found on :: " + item_ID));
        item.setName(ItemDetails.getName());
        item.setAmount(ItemDetails.getAmount());
        item.setPrice(ItemDetails.getPrice());
        final Item updatedItem = itemRepository.save(item);
        return ResponseEntity.ok(updatedItem);
    }

    //Add item
    @PostMapping
    public Item createItem(@Valid @RequestBody Item item)
    {
        return itemRepository.save(item);
    }

    //Delete item
    @DeleteMapping("{item_ID}")
    public Map<String, Boolean> deleteUser(@PathVariable("item_ID") long item_ID) throws Exception
    {
        Item item = itemRepository.findById(item_ID)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found on :: " + item_ID));

        itemRepository.delete(item);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return response;
    }
}
