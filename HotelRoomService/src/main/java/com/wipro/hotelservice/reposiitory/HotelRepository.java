package com.wipro.hotelservice.reposiitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.hotelservice.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel ,Integer> {

}
