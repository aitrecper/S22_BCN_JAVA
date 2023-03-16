package com.aitor.recio;

import java.util.Random;

public class PT21 {

	public static void main(String[] args) {
		
		Random random = new Random();
	    int num = random.nextInt(2);
		
		Functions functions = new Functions();
		
		System.out.println(functions.javaOrNull("java"));
		System.out.println(functions.login("admin", "1234"));
		System.out.println(functions.isEven(num));
		
	}
}

class Functions {
	
	String javaOrNull(String java) {
		if(java=="java")
			return java;
		else
			return "null";
	}
	
	String login(String user, String password) {
		
		if(user == "admin" && password == "1234")
			return "Login true";
		else
			return "Login false";
	}
	
	boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;
	}
	
	Functions(){}
}