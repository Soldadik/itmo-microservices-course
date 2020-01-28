package com.order.api;

import com.order.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping(value = "/api/payments/")
public class PaymentServiceController
{
    @Autowired
    private PaymentServiceProxy paymentServiceProxy;

    public PaymentServiceController(PaymentServiceProxy paymentServiceProxy)
    {
        this.paymentServiceProxy = paymentServiceProxy;
    }

    @PostMapping
    public PaymentRequest addPayment(@RequestBody PaymentRequest paymentRequest)
    {
        return paymentServiceProxy.addPayment(paymentRequest);
    }
}
