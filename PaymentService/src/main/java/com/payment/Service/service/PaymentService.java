package com.payment.Service.service;



import java.util.List;

import com.payment.Service.Entity.Payment;

public interface PaymentService {
 Payment makePayment(Payment payment);
     Payment getPaymentDetails(int paymentId);
     List<Payment> getAllPaymentsDetails();
 }