package com.exceptions.working;

public class UdayClassNotFoundException extends ClassNotFoundException{

	public UdayClassNotFoundException(String message) throws UdayClassNotFoundException {
		super(message);
	}
	

}
