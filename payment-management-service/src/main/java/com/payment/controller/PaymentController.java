package com.payment.controller;

import com.payment.exception.ResourceNotFoundException;
import com.payment.model.Payment;
import com.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
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
    public ResponseEntity<Payment> getPaymentByID(@PathVariable(value = "payment_id") long payment_ID) throws ResourceNotFoundException
    {
        Payment payment = paymentRepository.findById(payment_ID).
                orElseThrow(() -> new ResourceNotFoundException("Payment not found on :: " + payment_ID));
        return ResponseEntity.ok().body(payment);
    }

    //TODO pay()

}
