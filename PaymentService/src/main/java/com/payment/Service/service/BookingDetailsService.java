package com.payment.Service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.payment.Service.model.BookingDetails;

@FeignClient(name="BOOKINGSERVICE")
public interface BookingDetailsService {
    @GetMapping("/{bookingId}")
	 BookingDetails getBookingDetailsById(@PathVariable("bookingId")int bookingId);

}