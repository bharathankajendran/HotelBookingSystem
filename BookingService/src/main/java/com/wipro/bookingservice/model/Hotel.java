package com.wipro.bookingservice.model;

public class Hotel {
	private int hotelId;
	private String city;
	private String hotelName;
	private String address;
	private String description;
	private double avgRatePerDay;
	private String email;
	private String hotelPhone1;
	private String hotelPhone2;
	private String website;
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", city=" + city + ", hotelName=" + hotelName + ", address=" + address
				+ ", description=" + description + ", avgRatePerDay=" + avgRatePerDay + ", email=" + email
				+ ", hotelPhone1=" + hotelPhone1 + ", hotelPhone2=" + hotelPhone2 + ", website=" + website + "]";
	}
	public int hotelId() {
		return hotelId;
	}
	public void hotel_id(int hotel_id) {
		this.hotelId = hotel_id;
	}
	
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAvgRatePerDay() {
		return avgRatePerDay;
	}
	public void setAvgRatePerDay(double avgRatePerDay) {
		this.avgRatePerDay = avgRatePerDay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHotelPhone1() {
		return hotelPhone1;
	}
	public void setHotelPhone1(String hotelPhone1) {
		this.hotelPhone1 = hotelPhone1;
	}
	public String getHotelPhone2() {
		return hotelPhone2;
	}
	public void setHotelPhone2(String hotelPhone2) {
		this.hotelPhone2 = hotelPhone2;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
}
