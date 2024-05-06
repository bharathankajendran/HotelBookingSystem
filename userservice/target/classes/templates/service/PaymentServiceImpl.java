package com.wipro.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.payment.Entity.Payment;
import com.wipro.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment addPayment(Payment payment) {
        // Perform any additional business logic/validation before saving
        return paymentRepository.save(payment);
    }


}
