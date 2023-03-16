package com.recio.aitor;

public class PT20 {

	public static void main(String[] args) {
		int i=0;
		
		while(i<3) {
			System.out.println("Bucle while iteración: " + (i+1));
			i++;
		}
		
		for(i=0;i<3;i++)
			System.out.println("Bucle for iteración: " + (i+1));
		
		
		for (int j = 0; j < 10; j++) {
			if(j == 4)
				continue;
			System.out.println("Iteración "+ (j+1));
		}
	}
}
