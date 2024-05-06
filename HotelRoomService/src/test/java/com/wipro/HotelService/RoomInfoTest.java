package com.wipro.HotelService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.bookingservice.model.Hotel;
import com.wipro.hotelservice.entity.Room;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoomInfoTest {

    private Room roomInfo;

    @BeforeEach
    public void setUp() {
        // Initialize a new RoomInfo object before each test
        roomInfo = new Room();
    }

    @Test
    public void testRoomInfoConstructor() {
        // Verify that the default constructor initializes the object correctly
        assertNotNull(roomInfo);
        assertEquals(0, roomInfo.getRoomId()); // Assuming roomId starts from 0
        assertNull(roomInfo.getHotel());
        assertNull(roomInfo.getRoomNumber());
        assertNull(roomInfo.getRoomType());
        assertEquals(0.0, roomInfo.getRatePerDay());
        assertFalse(roomInfo.isAvailable());
    }


    // Additional test cases can be added based on specific requirements
}
