package com.wipro.bookingservice.model;

import com.wipro.bookingservice.entity.BookingDetails;

public class BookingPayload {
	private String hotelName;
	private String roomno;
	private String customer;
	private int amount;
	private String roomType;
	private String mobile;
	private String hotelphone1;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHotelphone1() {
		return hotelphone1;
	}
	public void setHotelphone1(String hotelphone1) {
		this.hotelphone1 = hotelphone1;
	}
	public BookingPayload() {
		super();
		this.hotelName = hotelName;
		this.roomno = roomno;
		this.customer = customer;
		this.amount = amount;
		this.roomType = roomType;
		this.mobile = mobile;
		this.hotelphone1 = hotelphone1;
	}
	
	
}
