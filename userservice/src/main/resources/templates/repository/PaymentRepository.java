package com.wipro.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.payment.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    // custom queries if needed
}