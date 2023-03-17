package com.recio.aitor;

import java.util.Random;

public class PT23 {

	public static void main(String[] args) {
		
		final String[] OPTIONS =  {"\033[0;1m","\033[0;3m","\033[0;4m","\u001B[41m","\u001B[42m","\u001B[43m"};
		final String RESET_CODE = "\u001B[0m";
		
		Random random = new Random();
	    
	    for(int i = 0; i < 10;i++) {
		    int num = random.nextInt(6);
		    System.out.println(OPTIONS[num] + "Hello World!" + RESET_CODE);
	    }
	}
}
