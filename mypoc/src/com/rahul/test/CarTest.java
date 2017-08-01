package com.rahul.test;



import org.junit.Assert;

import org.junit.Test;

import com.rahul.domain.Car;

public class CarTest {
	
	@Test
	public void testCar() {

		Car car=new Car("k",64000,"start",false,2);
		Assert.assertEquals("k",car.getCarName());
		Assert.assertEquals(64000, car.getCarValue());
		   
	}


	@Test
	public void testGetterSetterCarName() {
		Car car=new Car();
		final String carName = "foo";
		car.setCarName("foo");
		Assert.assertEquals(car.getCarName(), carName);
	}

	@Test
	public void testGetterSetterCarValue() {
		Car car=new Car();
		final int carValue = 47000;
		car.setCarValue(47000);
		Assert.assertEquals(car.getCarValue(), carValue);
	}

	



}
