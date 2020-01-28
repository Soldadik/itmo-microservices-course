package com.order.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.order.exception.ResourceNotFoundException;
import jdk.nashorn.internal.parser.JSONParser;
import org.assertj.core.util.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RefreshScope
@RestController
@RequestMapping(value = "/api")
public class CatalogServiceController
{
    @Autowired
    private CatalogServiceProxy catalogServiceProxy;

    public CatalogServiceController(CatalogServiceProxy catalogServiceProxy)
    {
        this.catalogServiceProxy = catalogServiceProxy;
    }

    @RequestMapping(value = "/catalog/carts/{cart_ID}", method = RequestMethod.GET)
    public ResponseEntity<List<CatalogResponse>> getCartByID(@PathVariable("cart_ID") long cart_ID) throws ResourceNotFoundException
    {
        //JSONParser parser = new JSONParser();
        //parser
        Gson gson = new Gson();

        //List<CatalogResponse> response = catalogServiceProxy.getCartByID(cart_ID);
        //List<CatalogResponse> response = gson.fromJson(catalogServiceProxy.getCartByID(cart_ID), List.class);
        //List<CatalogResponse> response = Streams.stream(catalogServiceProxy.getCartByID(cart_ID).iterator()).collect(Collectors.toList());
        List<CatalogResponse> response = gson.fromJson(catalogServiceProxy.getCartByID(cart_ID).toString(), new TypeToken<ArrayList<CatalogResponse>>(){}.getType());

        /*List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        //Add the Jackson Message converter
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        // Note: here we are making this converter to process any kind of response,
        // not only application/*json, which is the default behaviour
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange(response, )
        restTemplate.setMessageConverters(messageConverters);*/

        return ResponseEntity.ok(response);
    }
}
