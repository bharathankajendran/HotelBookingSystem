package com.wipro.hotelservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.hotelservice.entity.Hotel;
import com.wipro.hotelservice.entity.Room;
import com.wipro.hotelservice.exception.ResourceNotFoundException;
import com.wipro.hotelservice.model.RoomModel;
import com.wipro.hotelservice.reposiitory.HotelRepository;
import com.wipro.hotelservice.reposiitory.RoomRepository;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Room addRoom(RoomModel room) {
    	Optional<Hotel> hotel = hotelRepository.findById(room.getHotelId());
		if(hotel.isEmpty()) {
			throw new ResourceNotFoundException("Hotel not found with Id"+room.getHotelId());			
		}
		
		Room rooms =new Room();
		
		rooms.setHotel(hotel.get());
		rooms.setRoomNumber(room.getRoomNumber());
		rooms.setRoomType(room.getRoomType());
		rooms.setRatePerDay(room.getRatePerDay());
		rooms.setAvailable(room.isAvailable());
		
		return roomRepository.save(rooms);
    }

    @Override
    public Room updateRoom(Room room) {
        if (roomRepository.existsById(room.getRoomId())) {
            return roomRepository.save(room); // Update the room details
        } else {
            throw new ResourceNotFoundException("Room with ID " + room.getRoomId() + " not found");
        }
    }

    @Override
    public Room removeRoom(int roomId) {
        Optional<Room> optionalRoom = roomRepository.findById(roomId);

        if (optionalRoom.isPresent()) {
            Room roomToRemove = optionalRoom.get();
            roomRepository.deleteById(roomId);
            return roomToRemove;
        } else {
            throw new ResourceNotFoundException("Room with ID " + roomId + " not found");
        }
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomById(int roomId) {
        Optional<Room> optionalRoom = roomRepository.findById(roomId);

        if (optionalRoom.isPresent()) {
            return optionalRoom.get(); // Return the room if found
        } else {
            throw new ResourceNotFoundException("Room with ID " + roomId + " not found");
        }
    }

	
}