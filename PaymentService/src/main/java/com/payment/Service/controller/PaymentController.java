package com.payment.Service.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.Service.Entity.Payment;
import com.payment.Service.service.PaymentService;


@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
    private  PaymentService paymentService;
	@PostMapping("/makepayment")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment paymentRequest) {
        Payment payment = paymentService.makePayment(paymentRequest);
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }
    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getPaymentDetails(@PathVariable int paymentId) {
        Payment payment = paymentService.getPaymentDetails(paymentId);
        if (payment != null) {
            return new ResponseEntity<>(payment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Payment>> viewAllPayments() {
        List<Payment> payments = paymentService.getAllPaymentsDetails();
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }
}