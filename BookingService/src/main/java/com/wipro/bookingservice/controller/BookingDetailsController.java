package com.wipro.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.bookingservice.entity.BookingDetails;
import com.wipro.bookingservice.model.BookingPayload;
import com.wipro.bookingservice.service.BookingDetailsService;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingDetailsController {
    @Autowired
    private BookingDetailsService bookingDetailsService;

    @PostMapping("/add")
    public BookingDetails addBooking(@RequestBody BookingDetails bookingDetails) {
        return bookingDetailsService.addBookingDetails(bookingDetails);
    }

    @PutMapping("/update")
    public BookingDetails updateBooking(@RequestBody BookingDetails bookingDetails) {
        return bookingDetailsService.updateBookingDetails(bookingDetails);
    }

    @DeleteMapping("/remove/{bookingId}")
    public void removeBooking(@PathVariable int bookingId) {
        bookingDetailsService.removeBookingDetails(bookingId);
    }

    @GetMapping("/all")
    public List<BookingDetails> getAllBookings() {
        return bookingDetailsService.getAllBookingDetails();
    }
    @GetMapping("/{bookingId}")
    public BookingPayload getBookingById(@PathVariable("bookingId") int bookingId) {
        return bookingDetailsService.getBookingDetailsById(bookingId);
    }
}
