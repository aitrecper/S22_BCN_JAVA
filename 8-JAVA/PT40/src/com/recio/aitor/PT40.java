package com.recio.aitor;

import java.util.Scanner;

public class PT40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una palabra o frase: ");
		String frase = sc.nextLine();
		System.out.println("Palabra o frase introducida: " + frase);
		
		System.out.print("Introduce un boolean (true/false): ");
		boolean posible = sc.nextBoolean();
		System.out.println("Valor booleano introducido: " + posible);
		
		System.out.print("Introduce un byte: ");
		byte varByte = sc.nextByte();
		System.out.println("Valor byte introducido: " + varByte);
		
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		System.out.println("Número introducido: " + num);
		
		System.out.print("Introduce un número más largo: ");
		long longNum = sc.nextLong();
		System.out.println("Número long introducido: " + longNum);
		
		System.out.print("Introduce un decimal: ");
		float floatNum = sc.nextFloat();
		System.out.println("El decimal introducido es: " + floatNum);
		
		System.out.print("Introduce un número con más decimales: ");
		double doubleNum = sc.nextDouble();
		System.out.println("El decimal introducido es: " + doubleNum);
		
		
	}
}
