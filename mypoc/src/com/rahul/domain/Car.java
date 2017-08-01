package com.rahul.domain;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.rahul.exception.InvalidRegistrationException;

public class Car extends VehicleInterior implements Vehicle {
	
	private String carName;
	private int carValue;
	private String startEngine;
	private boolean isRunning;
	private int id;
	
	public Car(String carName, int carValue, String startEngine, boolean isRunning) {
		
		this.carName = carName;
		this.carValue = carValue;
		this.startEngine = startEngine;
		this.isRunning = isRunning;
		
	}

 public Car(String carName, int carValue, String startEngine, boolean isRunning, int id) {
	
		this.carName = carName;
		this.carValue = carValue;
		this.startEngine = startEngine;
		this.isRunning = isRunning;
		this.id = id;
	}

	public Car() {
		
	}
	

	public String getStartEngine() {
		return startEngine;
	}

	public void setStartEngine(String startEngine) {
		this.startEngine = startEngine;
	}

	

	public boolean getIsRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarValue() {
		return carValue;
	}

	public void setCarValue(int carValue) {
		this.carValue = carValue;
	}

	@Override
	public void start(String s) {
		startEngine = s;
		System.out.println("car is starting"+startEngine);
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run(Boolean b) {
		isRunning = b;
	if(isRunning==false)	{
	System.out.println("Car is not running "+isRunning);
	}
	else{
		System.out.println("Car is running"+isRunning);
	}
	}

	@Override
	public void interiorItemsNeeded() {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1, "leather seats");
        hm.put(2, "Bluetooth recorder");
        hm.put(3, "Topless");
        Set<Integer> keys = hm.keySet();  //get all keys
        for(Integer i: keys)
        {
            System.out.println(" contains "+hm.get(i));
        }
	}

	@Override
public void registrationStatus() throws InvalidRegistrationException {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter registration status code: ");
	 int a = sc.nextInt();
		if(a>10){
			regError();
		}
		else{
			System.out.println("valid Registration");
		}
		sc.close();
	}

	private void regError() throws InvalidRegistrationException {
		throw new InvalidRegistrationException("not valid");
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carValue=" + carValue + ", startEngine=" + startEngine + ", isRunning="
				+ isRunning + ", id=" + id + "]";
	}



}
