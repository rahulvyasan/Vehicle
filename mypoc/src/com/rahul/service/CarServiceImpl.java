package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.CarDao;
import com.rahul.domain.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarDao carDao;
	@Override
	public boolean create(Car car) {
		return carDao.create(car);
	}

	@Override
	public Car getCar(Integer id) {
		return carDao.getCar(id);
	}

	@Override
	public boolean delete(Car car) {
		return carDao.delete(car);
	}

	@Override
	public boolean update(Car car) {
		return carDao.update(car);
	}
	@Override
	public List<Car> getAllCars() {
		List<Car> carList = carDao.getAllCars();
		return carList;
	}

}
