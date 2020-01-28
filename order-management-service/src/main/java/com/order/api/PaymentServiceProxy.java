package com.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="payment-service")
public interface PaymentServiceProxy
{
    @RequestMapping(value = "/api/payments/", method = RequestMethod.POST)
    PaymentRequest addPayment(PaymentRequest paymentRequest);
}
