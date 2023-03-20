package com.recio.aitor;

public class PT33 {

	public static void main(String[] args) {
		
		
		Tarjeta tarjeta = new Tarjeta("VISA", 1234567898765432l, 12, 99, "Al Holder");
		

		tarjeta.pay(10.28);
		
		tarjeta.activate();
		
		tarjeta.pay(15000.0);
		
		tarjeta.pay(10.28);
		
		tarjeta.cancel();
	}
}
