package com.recio.aitor;

import java.util.Random;

public class PT15 {
	public static void main(String[] args) {
		int num1 = 4;
		
		String result =num1 % 2 == 0 ? "Es par" : "Es impar";
		System.out.println(result);
		
		Random random = new Random();
	    int num2 = random.nextInt(2);
	    
	    if(num2==0)
	    	System.out.println("Negro");
	    else
	    	System.out.println("Blanco");
	}
}
