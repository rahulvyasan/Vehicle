package com.rahul.test;

import com.rahul.domain.Car;
import com.rahul.exception.InvalidRegistrationException;


public class Test {

	public static void main(String[] args) {
		
		Car car = new Car("fz",80000,"start",false);
	   
	    car.interiorItemsNeeded();
	    
	    
	    try {
			car.registrationStatus();
		} catch (InvalidRegistrationException e) {
			
			e.printStackTrace();
		}
	    
		

}
}