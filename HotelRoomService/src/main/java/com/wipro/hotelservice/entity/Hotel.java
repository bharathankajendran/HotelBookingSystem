package com.wipro.hotelservice.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;
    private String city;
    private String hotelName;
    private String address;
    private String description;
    private double avgRatePerDay;
    private String email;
    private String phone1;

    @OneToMany(mappedBy = "hotel",cascade=CascadeType.ALL)
    private List<Room> rooms;
    public Hotel() {
    }

    public Hotel(String city, String hotelName, String address, String description,
                 double avgRatePerDay, String email, String phone1) {
        this.city = city;
        this.hotelName = hotelName;
        this.address = address;
        this.description = description;
        this.avgRatePerDay = avgRatePerDay;
        this.email = email;
        this.phone1 = phone1;
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

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", city='" + city + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", avgRatePerDay=" + avgRatePerDay +
                ", email='" + email + '\'' +
                ", phone1='" + phone1 + '\'' +
                '}';
    }

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
    
}
