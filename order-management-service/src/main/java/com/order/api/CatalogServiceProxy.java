package com.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="catalog-service")
public interface CatalogServiceProxy
{
    @RequestMapping(value = "/api/catalog/carts/{cart_ID}", method = RequestMethod.GET)
    List<CatalogResponse> getCartByID(@PathVariable(value = "cart_ID") long cart_ID);
}
