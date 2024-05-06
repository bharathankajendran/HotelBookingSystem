package com.wipro.hotelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.hotelservice.entity.Hotel;
import com.wipro.hotelservice.service.HotelService;

import java.util.List;

@RestController
@RequestMapping("/Hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/AddHotel")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        Hotel addedHotel = hotelService.addHotel(hotel);
        return new ResponseEntity<>(addedHotel, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable int id, @RequestBody Hotel hotel) {
        hotel.setHotelId(id); // Ensure the ID in the path matches the object's ID
        Hotel updatedHotel = hotelService.updateHotel(hotel);
        if (updatedHotel != null) {
            return new ResponseEntity<>(updatedHotel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Hotel> removeHotel(@PathVariable int id) {
        Hotel removedHotel = hotelService.removeHotel(id);
        if (removedHotel != null) {
            return new ResponseEntity<>(removedHotel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> showAllHotels() {
        List<Hotel> hotels = hotelService.showAllHotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> showHotel(@PathVariable int id) {
        Hotel hotel = hotelService.showHotel(id);
        if (hotel != null) {
            return new ResponseEntity<>(hotel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
