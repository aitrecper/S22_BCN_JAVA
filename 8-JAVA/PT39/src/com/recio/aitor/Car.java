package com.recio.aitor;

public class Car {

	private String company;
	private int speed;
	
	Car(String company, int speed){
		this.company = company;
		this.speed = speed;
	}
	
	public void getSpeed() {
		System.out.println(company + " car's speed is " + speed + "Km/hr");
	}
}
