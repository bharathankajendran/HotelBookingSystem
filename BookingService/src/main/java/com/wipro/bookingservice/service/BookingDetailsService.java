package com.wipro.bookingservice.service;

import java.util.List;

import com.wipro.bookingservice.entity.BookingDetails;
import com.wipro.bookingservice.model.BookingPayload;



public interface BookingDetailsService {

    BookingDetails addBookingDetails(BookingDetails bookingdetails);

    BookingDetails updateBookingDetails(BookingDetails bookingDetails);

    void removeBookingDetails(int bookingId);

    List<BookingDetails> getAllBookingDetails();

    BookingPayload getBookingDetailsById(int bookingId);
}
