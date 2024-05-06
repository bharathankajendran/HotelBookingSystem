package com.payment.Service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.payment.Service.Entity.Payment;

public class PaymentTest {

    @Test
    public void testDefaultConstructor() {
        // Create a new Payment using default constructor
        Payment payment = new Payment();

        // Verify initial values are null (for reference types) or zero (for primitive types)
        equals(payment.getPaymentId());
//        assertEquals(null, payment.getTransactionId());
        assertEquals(1, payment.getBookingId());
        assertEquals(0, payment.getAmount());
        assertEquals(0, payment.getPaymentAmount());
    }

    @Test
    public void testParameterizedConstructorAndGetters() {
        // Create a new Payment using parameterized constructor
        Long paymentId = 1L;
        Long transactionId = 100L;
        Integer bookingId = 12345;
        int amount = 500;
        int paymentAmount = 500;

        Payment payment = new Payment();

        // Verify values set by constructor using getters
        assertEquals(paymentId, payment.getPaymentId());
//        assertEquals(transactionId, payment.getTransactionId());
        assertEquals(bookingId, payment.getBookingId());
        assertEquals(amount, payment.getAmount());
        assertEquals(paymentAmount, payment.getPaymentAmount());
    }

    @Test
    public void testSetters() {
        // Create a new Payment
        Payment payment = new Payment();

        // Set values using setter methods
        int paymentId = 2;
        Long transactionId = 200L;
        Integer bookingId = 54321;
        int amount = 1000;
        int paymentAmount = 800;

        payment.setPaymentId(paymentId);
//        payment.setTransactionId(transactionId);
        payment.setBookingId(bookingId);
        payment.setAmount(amount);
        payment.setPaymentAmount(paymentAmount);

        // Verify values set by setters using getters
        assertEquals(paymentId, payment.getPaymentId());
//        assertEquals(transactionId, payment.getTransactionId());
        assertEquals(bookingId, payment.getBookingId());
        assertEquals(amount, payment.getAmount());
        assertEquals(paymentAmount, payment.getPaymentAmount());
    }
}
