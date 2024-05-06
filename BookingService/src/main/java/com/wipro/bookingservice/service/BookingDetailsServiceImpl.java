package com.wipro.bookingservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.bookingservice.entity.BookingDetails;
import com.wipro.bookingservice.exception.ResourceNotFoundException;
import com.wipro.bookingservice.model.BookingPayload;
import com.wipro.bookingservice.model.Hotel;
import com.wipro.bookingservice.model.RoomDetails;
import com.wipro.bookingservice.model.User;
import com.wipro.bookingservice.repository.BookingDetailsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookingDetailsServiceImpl implements BookingDetailsService {

    @Autowired
    BookingDetailsRepository bookingDetailsRepository;

    @Autowired
    HotelServiceConsumer hotelServiceConsumer;

    @Autowired
    UserServiceConsumer userServiceConsumer;

    @Override
    public BookingDetails addBookingDetails(BookingDetails bookingDetails) {
        return bookingDetailsRepository.save(bookingDetails);
    }
    @Override
    public BookingDetails updateBookingDetails(BookingDetails bookingDetails) {
        if (bookingDetailsRepository.existsById(bookingDetails.getBookingId())) {
            return bookingDetailsRepository.save(bookingDetails); // Update the booking details
        } else {
            // Booking not found, throw ResourceNotFoundException
            throw new ResourceNotFoundException("Booking with ID " + bookingDetails.getBookingId() + " not found");
        }
    }

    @Override
    public void removeBookingDetails(int bookingId) {
        if (bookingDetailsRepository.existsById(bookingId)) {
            bookingDetailsRepository.deleteById(bookingId); 
        } else {
            throw new ResourceNotFoundException("Booking with ID " + bookingId + " not found");
        }
    }
    @Override
	public BookingPayload getBookingDetailsById(int bookingId) {
		Optional<BookingDetails> optionalbooking = bookingDetailsRepository.findById(bookingId);
		if (optionalbooking.isEmpty()) {
			throw new ResourceNotFoundException("Booking Details Not found with id " + bookingId);
		}
		BookingDetails booking = optionalbooking.get();

		User user = userServiceConsumer.getUserById(booking.getUserId());
		RoomDetails room = hotelServiceConsumer.getRoomDetailsById(booking.getRoomId());
		Hotel hotel = hotelServiceConsumer.getHotelById(booking.getHotelId());

		BookingPayload bookingResponse = new BookingPayload();

		bookingResponse.setHotelName(hotel.getHotelName());
		bookingResponse.setCustomer(user.getUserName());
		bookingResponse.setRoomno(room.getRoomNo());
		bookingResponse.setHotelphone1(hotel.getHotelPhone1());
		bookingResponse.setMobile(user.getMobile());
		bookingResponse.setRoomno(room.getRoomNo());
		bookingResponse.setRoomType(room.getRoomType());
		bookingResponse.setAmount(booking.getAmount());
		return bookingResponse;
	}

    @Override
    public List<BookingDetails> getAllBookingDetails() {
        return bookingDetailsRepository.findAll();
    }

}
