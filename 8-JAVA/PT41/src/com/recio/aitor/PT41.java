package com.recio.aitor;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class PT41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ITALIAN);
		
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
		
		
		int[] numeros = { 1, 2, 3 };

        try {
            System.out.println(numeros[3]);
            int resultado = 10 / 0;
            System.out.println("El resultado es: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: El índice está fuera de los límites del array.");
        }
        
        try {
        	int resultado = 1 / 0;
            System.out.println("El resultado es: " + resultado);
        }
        catch (ArithmeticException  e) {
			// TODO: handle exception
		}
        
        try {
            int resultado = dividir(10, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
            e.printStackTrace();
        }
        
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese un número real: ");
                numero = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número válido.");
                sc.next(); // Limpiar el búfer del scanner
            }
        }

        System.out.println("El número ingresado es: " + numero);
		
		sc.close();
	}
	
	public static int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero");
        }
        return numerador / denominador;
    }
}
