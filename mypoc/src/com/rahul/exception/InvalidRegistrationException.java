package com.rahul.exception;


public class InvalidRegistrationException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public  InvalidRegistrationException(String message){
		System.out.println(message);
	}
}
