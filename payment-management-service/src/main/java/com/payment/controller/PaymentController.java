package com.payment.controller;

import com.payment.exception.ResourceNotFoundException;
import com.payment.model.Payment;
import com.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/payments/")
public class PaymentController
{
    @Autowired
    private PaymentRepository paymentRepository;

    //Get payments
    @GetMapping
    public List<Payment> getPayments()
    {
        return paymentRepository.findAll();
    }

    //Get payment by ID
    @GetMapping("{payment_ID}")
    public ResponseEntity<Payment> getPaymentByID(@PathVariable("payment_ID") long payment_ID) throws ResourceNotFoundException
    {
        Payment payment = paymentRepository.findById(payment_ID).
                orElseThrow(() -> new ResourceNotFoundException("Payment not found on :: " + payment_ID));
        return ResponseEntity.ok().body(payment);
    }

    //Add payment
    @PostMapping
    public Payment createOrder(@RequestBody Payment payment)
    {
        return paymentRepository.save(payment);
    }

    //Pay
    public void pay() { }

}
