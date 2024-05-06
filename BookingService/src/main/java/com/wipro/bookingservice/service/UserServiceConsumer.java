package com.wipro.bookingservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.bookingservice.model.User;

@FeignClient(name = "USER-SERVICE")
public interface UserServiceConsumer {
	@GetMapping("/{userId}")
	User getUserById(@PathVariable int userId);
}
