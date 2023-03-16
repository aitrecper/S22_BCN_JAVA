package com.recio.aitor;

public class PT19 {

	public static void main(String[] args) {
		
		// Apartado 1
		for(int i = 0; i < 10; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
		// Apartado 2
		for(int i = 0; i < 13; i++) {
			if(i%3==0)
				System.out.println(i);
		}
		
		// Apartado 3
		int numSaludos = 3;
		int i = 0;
		boolean first = true;
		
		while(i<numSaludos || first) {
			System.out.println("Hola while");
			i++;
			first = false;
		}
			
		i=0;
		do{
			System.out.println("Hola do-while");
			i++;
		}while(i<numSaludos);
		
		first = true;
		
		for(i = 0; i < numSaludos || first; i++) {
			first = false;
			System.out.println("Hola for");
		}
			
		
		
		
		// Apartado 4
		
		String abecedary = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
		String reverse = "";
		int length = abecedary.length();
		
		for( i=0;i < length ;i++) {
			
			reverse = abecedary.charAt(0) + reverse;
			if(abecedary.length() > 0)
				System.out.println(abecedary);
			abecedary = abecedary.substring(1);
		}
		for( i=0;i<reverse.length();i++)
			if(i >= 2)
				System.out.println(reverse.substring(0,i));
	}
}
