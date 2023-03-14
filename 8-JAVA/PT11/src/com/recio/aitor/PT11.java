package com.recio.aitor;

public class PT11 {

	static int num = 0;

	public static void increase() {
		num++;
		System.out.println(num);
	}
	
	public static void decrease() {
		num-=2;
		System.out.println(num);
	}

	public static void main(String[] args) {

		increase();
		decrease();
	}

}
