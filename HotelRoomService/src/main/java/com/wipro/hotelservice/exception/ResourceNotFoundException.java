package com.wipro.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException  {

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
