package com.recio.aitor;

public class PT13 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 2;
		
		if(num4 == num2)
			System.out.println("num4 y num2 son iguales");
		
		if(num2 == num3)
			System.out.println("num2 y num3 son iguales");
		
		if(num1 != num3)
			System.out.println("num1 y num3 no son iguales");
		
		if(num2 != num1)
			System.out.println("num2 y num1 no son iguales");
		
		if(num4 < num3)
			System.out.println("num4 es menor que num3");
		
		if(num3 < num1)
			System.out.println("num3 es menor que num1");
		else
			System.out.println("num1 es mayor que num3");
		
		if(num2 > num4)
			System.out.println("num2 es mayor que num4");
		
		if(num2 > num3)
			System.out.println("num2 es mayor que num4");
		
		if(num2 <= num3)
			System.out.println("num2 es menor o igual que num3");
		
		if(num2 <= num4)
			System.out.println("num2 es menor o igual que num4");
		
		if(num2 <= num1)
			System.out.println("num2 es menor o igual que num1");
		
		if(num1 >= num2)
			System.out.println("num1 es mayor o igual que num2");
		
		if(num2 >= num3)
			System.out.println("num2 es mayor o igual que num1");
	}
}
