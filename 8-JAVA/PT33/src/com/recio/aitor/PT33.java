package com.recio.aitor;
import com.recio.aitor.Car;

public class PT33 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car(200,300);
		
		c1.refuel();
		c1.setMaxSpeed(150);
		System.out.println("La capacidad de fuel del coche c1 es: " + c1.getFuel() + "l y su velocidad máxima: " + c1.getMaxSpeed() + "km/h");
		
		c2.refuel();
		c2.setMaxSpeed(80);
		
		System.out.println("La capacidad de fuel del coche c2 es: " + c2.getFuel() + "l y su velocidad máxima: " + c2.getMaxSpeed() + "km/h");
		
		System.out.println("La capacidad de fuel del coche c3 es: " + c3.getFuel() + "l y su velocidad máxima: " + c3.getMaxSpeed() + "km/h");
		
	}
}
