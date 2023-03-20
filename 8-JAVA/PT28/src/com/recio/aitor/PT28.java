package com.recio.aitor;

public class PT28 {

	public static void main(String[] args) {
		
		final String NAME = "Aitor";
		final String SURNAME1 = "Recio";
		final String SURNAME2 = "Pérez";
		
		System.out.printf("%S\t\t%S\t%S%n",NAME,SURNAME1,SURNAME2);
		System.out.printf("%S    %s  %s%n",NAME,SURNAME1,SURNAME2);
		System.out.printf("%3$s, %2$s, %1$s%n",NAME,SURNAME1,SURNAME2);
		System.out.printf("%8d%n",22);
		System.out.printf("%010d%n",22);
		System.out.printf("%010.2f%n",17.1829327);
		System.out.printf("%s%n%s", "Hola", "Mundo");
	}
}
