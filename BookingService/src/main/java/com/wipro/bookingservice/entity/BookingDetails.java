package com.wipro.bookingservice.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class BookingDetails {
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @Column(name = "booking_id")
	    private int bookingId;

	    @Column(name = "hotel_id")
	    private int hotelId;

	    @Column(name = "room_id")
	    private int roomId;

	    @Column(name = "user_id")
	    private int userId;

	    @Column(name = "booked_from")
	    private LocalDate bookedFrom;

	    @Column(name = "booked_to")
	    private LocalDate bookedTo;

	    @Column(name = "no_of_adults")
	    private int numberOfAdults;

	    @Column(name = "no_of_children")
	    private int numberOfChildren;

	    @Column(name = "amount")
	    private int amount;

		
		public int getBookingId() {
			return bookingId;
		}

		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}

		public int getHotelId() {
			return hotelId;
		}

		public void setHotelId(int hotelId) {
			this.hotelId = hotelId;
		}

		public int getRoomId() {
			return roomId;
		}

		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public LocalDate getBookedFrom() {
			return bookedFrom;
		}

		public void setBookedFrom(LocalDate bookedFrom) {
			this.bookedFrom = bookedFrom;
		}

		public LocalDate getBookedTo() {
			return bookedTo;
		}

		public void setBookedTo(LocalDate bookedTo) {
			this.bookedTo = bookedTo;
		}

		public int getNumberOfAdults() {
			return numberOfAdults;
		}

		public void setNumberOfAdults(int numberOfAdults) {
			this.numberOfAdults = numberOfAdults;
		}

		public int getNumberOfChildren() {
			return numberOfChildren;
		}

		public void setNumberOfChildren(int numberOfChildren) {
			this.numberOfChildren = numberOfChildren;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public BookingDetails() {
			super();
			// TODO Auto-generated constructor stub
		}



		
}
