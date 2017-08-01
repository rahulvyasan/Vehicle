package com.rahul.dao;

import java.util.List;

import javax.sql.DataSource;

import com.rahul.domain.Car;


public interface CarDao {
	public void setDataSource(DataSource ds);
	public boolean create(Car car);
	public Car getCar(Integer id);
	public boolean delete(Car car);
	public boolean update(Car car);
	public List<Car> getAllCars();
}
