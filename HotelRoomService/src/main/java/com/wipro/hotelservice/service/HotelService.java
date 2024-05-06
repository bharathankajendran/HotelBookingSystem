package com.wipro.hotelservice.service;

import java.util.List;

import com.wipro.hotelservice.entity.Hotel;


public interface HotelService {


    Hotel addHotel(Hotel hotel);
    Hotel updateHotel(Hotel hotel);
    Hotel removeHotel(int id);
    List<Hotel> showAllHotels();
    Hotel showHotel(int id);
}
