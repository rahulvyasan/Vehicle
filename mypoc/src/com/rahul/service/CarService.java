package com.rahul.service;



import java.util.List;


import com.rahul.domain.Car;

public interface CarService {
	
	public boolean create(Car car);
	public Car getCar(Integer id);
	public boolean delete(Car car);
	public boolean update(Car car);
	public List<Car> getAllCars();
}
