package com.wipro.hotelservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.hotelservice.entity.Room;
import com.wipro.hotelservice.model.RoomModel;
import com.wipro.hotelservice.service.RoomService;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    // Endpoint to add a new room
    @PostMapping("/add")
    public ResponseEntity<Room> addRoom(@RequestBody RoomModel room) {
        Room addedRoom = roomService.addRoom(room);
        return new ResponseEntity<>(addedRoom, HttpStatus.CREATED);
    }

    // Endpoint to update an existing room
    @PutMapping("/updateds")
    public ResponseEntity<Room> updateRoom(@RequestBody Room room) {
        Room updatedRoom = roomService.updateRoom(room);
        return new ResponseEntity<>(updatedRoom, HttpStatus.OK);
    }

    // Endpoint to delete a room by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable int id) {
        roomService.removeRoom(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Endpoint to retrieve all rooms
    @GetMapping("/all")
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> roomList = roomService.getAllRooms();
        return new ResponseEntity<>(roomList, HttpStatus.OK);
    }

    // Endpoint to retrieve a room by ID
    @GetMapping("/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable int id) {
        Room room = roomService.getRoomById(id);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }
}
