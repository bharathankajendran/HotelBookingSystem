package com.wipro.bookingservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.wipro.bookingservice.model.Hotel;
import com.wipro.bookingservice.model.RoomDetails;


@FeignClient(name="HOTELROOM-SERVICE")
public interface HotelServiceConsumer {
	@GetMapping("Hotel/{id}")
	Hotel getHotelById(@PathVariable("id")int hotelId);
	@GetMapping("rooms/{id}")
	RoomDetails getRoomDetailsById(@PathVariable("id")int roomId);
	@PutMapping("rooms/updateds")
	RoomDetails updateRoom(RoomDetails room);
}
