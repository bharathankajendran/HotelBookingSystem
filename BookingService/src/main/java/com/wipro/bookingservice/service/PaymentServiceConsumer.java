package com.wipro.bookingservice.service;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.bookingservice.model.Payment;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentServiceConsumer {

    @GetMapping("/payments/booking/{bookingId}")
    List<Payment> getPaymentsByBookingId(@PathVariable("bookingId") int bookingId);
}
