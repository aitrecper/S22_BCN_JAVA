package com.recio.aitor;

public class Car {

	private int fuel;
	private int maxSpeed;
	
	Car(){}
	Car(int fuel, int maxSpeed){
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}
	
	public int getFuel() {
		return fuel;
	}
	public void refuel() {
		this.fuel = 100;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
