package com.wipro.bookingservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bookingservice.entity.BookingDetails;
import com.wipro.bookingservice.model.BookingPayload;


public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Integer> {

    
}
