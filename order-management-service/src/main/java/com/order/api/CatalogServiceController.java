package com.order.api;

import com.order.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RefreshScope
@RestController
@RequestMapping(value = "/api/catalog/carts/")
public class CatalogServiceController
{
    @Autowired
    private CatalogServiceProxy catalogServiceProxy;

    public CatalogServiceController(CatalogServiceProxy catalogServiceProxy)
    {
        this.catalogServiceProxy = catalogServiceProxy;
    }

    @RequestMapping(value = "{cart_ID}", method = RequestMethod.GET)
    public ResponseEntity<List<CatalogResponse>> getCartByID(@PathVariable("cart_ID") long cart_ID) throws ResourceNotFoundException
    {
        List<CatalogResponse> response = catalogServiceProxy.getCartByID(cart_ID);
        return ResponseEntity.ok(response);
    }
}
