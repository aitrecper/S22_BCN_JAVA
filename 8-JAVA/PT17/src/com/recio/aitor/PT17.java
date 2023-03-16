package com.recio.aitor;

public class PT17 {
	public static void main(String[] args) {
		
		int num1 = 9;
		
		switch(num1) {
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("Cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println("Siete");
				break;
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;
			default:
				System.out.println("No es un número del 1 al 9");
				break;
		}
		
		
		
		
		double number = 55;

		if (number > 0) {
			System.out.println("¡Es positivo!");
		} else if (number < 0) {
			System.out.println("¡Es negativo!");
		} else {
			System.out.println("¡Es cero, na de ná!");
		}
		
		String result = number > 0 ? "¡Es positivo!" : number < 0 ? "¡Es negativo!" : "¡Es cero, na de ná!";
		
		System.out.println(result);
	}
}
