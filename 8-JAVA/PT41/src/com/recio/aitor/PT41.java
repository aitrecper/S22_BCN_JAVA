package com.recio.aitor;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PT41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una palabra o frase: ");
		String frase = sc.nextLine();
		System.out.println("Palabra o frase introducida: " + frase);
		
		System.out.print("Introduce un boolean (true/false): ");
		try {
			boolean posible = sc.nextBoolean();
			System.out.println("Valor booleano introducido: " + posible);
		}catch(InputMismatchException e){
			System.err.println("No has introducido un booleano");
			sc.next();
		}
		
		System.out.print("Introduce un byte: ");
		byte varByte;
		try {
			varByte = sc.nextByte();
			System.out.println("Valor byte introducido: " + varByte);
		}catch(InputMismatchException e){
			System.err.println("No has introducido un byte");
			sc.next();
		}
		
		System.out.print("Introduce un número entero: ");
		try {
			int num = sc.nextInt();
			System.out.println("Número introducido: " + num);
		} catch (InputMismatchException e) {
			System.err.println("No has introducido un número entero");
			sc.next();
		}
		
		System.out.print("Introduce un número entero más largo: ");
		try {
			long longNum = sc.nextLong();
			System.out.println("Número long introducido: " + longNum);
		} catch (InputMismatchException e) {
			System.err.println("No has introducido un número entero");
			sc.next();
		}
		
		System.out.print("Introduce un decimal: ");
		try {
			float floatNum = sc.nextFloat();
			System.out.println("El decimal introducido es: " + floatNum);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("No has introducido un número");
			sc.next();
		}
		
		System.out.print("Introduce un número con más decimales: ");
		try {
			double doubleNum = sc.nextDouble();
			System.out.println("El decimal introducido es: " + doubleNum);
		} catch (InputMismatchException e) {
			System.err.println("No has introducido un número");
			sc.next();
		}
		
		sc.close();
	}
}