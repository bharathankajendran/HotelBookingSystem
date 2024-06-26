package com.wipro.hotelservice.reposiitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.hotelservice.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    
}
