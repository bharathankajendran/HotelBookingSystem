package com.wipro.BookingService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.wipro.bookingservice.entity.BookingDetails;
import java.time.LocalDate;
public class BookingTest {
    @Test
    public void testSetters() {
        // Create a new Booking
    	BookingDetails booking = new BookingDetails();

        // Set values using setter methods
        Integer bookingId = 2;
        int hotelId = 2001;
        int roomId = 201;
        int userId = 456;
        LocalDate bookedFrom = LocalDate.of(2024, 6, 1);
        LocalDate bookedTo = LocalDate.of(2024, 6, 5);
        int numberOfAdults = 1;
        int numberOfChildren = 0;
        int amount = 3000;

        booking.setBookingId(bookingId);
        booking.setHotelId(hotelId);
        booking.setRoomId(roomId);
        booking.setUserId(userId);
        booking.setBookedFrom(bookedFrom);
        booking.setBookedTo(bookedTo);
        booking.setNumberOfAdults(numberOfAdults);
        booking.setNumberOfChildren(numberOfChildren);
        booking.setAmount(amount);

        // Verify values set by setters using getters
        assertEquals(bookingId, booking.getBookingId());
        assertEquals(hotelId, booking.getHotelId());
        assertEquals(roomId, booking.getRoomId());
        assertEquals(userId, booking.getUserId());
        assertEquals(bookedFrom, booking.getBookedFrom());
        assertEquals(bookedTo, booking.getBookedTo());
        assertEquals(numberOfAdults, booking.getNumberOfAdults());
        assertEquals(numberOfChildren, booking.getNumberOfChildren());
        assertEquals(amount, booking.getAmount());
    }
}
