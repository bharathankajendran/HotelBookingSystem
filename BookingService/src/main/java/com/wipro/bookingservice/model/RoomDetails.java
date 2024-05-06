package com.wipro.bookingservice.model;

public class RoomDetails {
	private int roomId;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	private int hotelid;
	private String roomNo;
	private String roomType;
	private double ratePerDay;
	private boolean available;
	public RoomDetails(int roomId, int hotelid, String roomNo, String roomType, double ratePerDay, boolean available) {
		super();
		this.roomId = roomId;
		this.hotelid = hotelid;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.ratePerDay = ratePerDay;
		this.available = available;
	}
	public int getRoomid() {
		return roomId;
	}
	public void setRoomid(int roomid) {
		this.roomId = roomid;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
