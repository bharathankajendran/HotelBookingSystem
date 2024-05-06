package com.payment.Service.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.payment.Service.Entity.Payment;
import com.payment.Service.exception.ResourceNotFoundException;
import com.payment.Service.model.BookingDetails;
import com.payment.Service.repository.PaymentServiceRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
    private final PaymentServiceRepository paymentserviceRepository;
    @Autowired
    private BookingDetailsService bookingservice;
    public PaymentServiceImpl(PaymentServiceRepository paymentRepository) {
        this.paymentserviceRepository = paymentRepository;
    }
    
//    @Override
//    public Payment makePayment(Payment payment) {
//    	BookingDetails booking=bookingservice.getBookingDetailsById(payment.getBookingId());
//    	if(payment.getAmount()==(booking.getAmount())) {
//        Payment ProcessPament=paymentserviceRepository.save(payment);
//		return ProcessPament;
//    	}
//    	else {
//    		throw new ResourceNotFoundException("Payment Not Success");
//    	}
//    }
    @Override
    public Payment getPaymentDetails(int paymentId) {
        Optional<Payment> paymentOptional = paymentserviceRepository.findById(paymentId);
        return paymentOptional.orElse(null);
    }
    @Override
    public List<Payment> getAllPaymentsDetails() {
        return paymentserviceRepository.findAll();
    }

	@Override
	public Payment makePayment(Payment payment) {
        // Save the payment details to the database
        Payment savedPayment = paymentserviceRepository.save(payment);
        return savedPayment;
    }
	}
