package com.wipro.hotelservice.service;



import java.util.List;

import com.wipro.hotelservice.entity.Room;
import com.wipro.hotelservice.model.RoomModel;

public interface RoomService {

    Room addRoom(RoomModel room);

    Room updateRoom(Room room);

    Room removeRoom(int roomId);

    List<Room> getAllRooms();

    Room getRoomById(int roomId);
}

