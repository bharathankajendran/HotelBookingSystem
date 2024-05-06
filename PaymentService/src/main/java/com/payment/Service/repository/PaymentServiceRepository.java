package com.payment.Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.Service.Entity.Payment;

@Repository
public interface PaymentServiceRepository extends JpaRepository<Payment, Integer> {
 
}