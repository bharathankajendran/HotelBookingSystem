package com.wipro.hotelservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.hotelservice.entity.Hotel;
import com.wipro.hotelservice.exception.ResourceNotFoundException;
import com.wipro.hotelservice.reposiitory.HotelRepository;
import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
    	  if (hotelRepository.existsById(hotel.getHotelId())) {
              return hotelRepository.save(hotel); // Update the hotel if it exists
          } else {
              // Hotel not found, throw ResourceNotFoundException
              throw new ResourceNotFoundException("Hotel with ID " + hotel.getHotelId() + " not found");
          }
    }
    @Override
    public Hotel removeHotel(int id) {
        // Implement the logic to remove an existing hotel by ID
        Optional<Hotel> existingHotel = hotelRepository.findById(id);
        if (existingHotel.isEmpty()) {
            throw new ResourceNotFoundException("Hotel with ID " + id + " not found");
        }
        hotelRepository.deleteById(id);
        return existingHotel.get();
    }
    @Override
    public List<Hotel> showAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel showHotel(int id) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(id);
        if (optionalHotel.isPresent()) {
            return optionalHotel.get(); // Return the hotel if found
        } else {
            // Hotel not found, throw ResourceNotFoundException
            throw new ResourceNotFoundException("Hotel with ID " + id + " not found");
        }
    }
}
