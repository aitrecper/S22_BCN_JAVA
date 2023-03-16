package com.recio.aitor;

public class PT22 {
	public static void main(String[] args) {
		
		String resetCode = "\u001B[0m";
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\u001B[48;5;39m                              " + resetCode);
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("\u001B[48;2;255;213;0m                              " + resetCode);
		}
		
		System.out.println();
		
		
		System.out.print("\u001B[48;2;13;94;175m    " + resetCode + "  " + "\u001B[48;2;13;94;175m                        " + resetCode+"\n");
		System.out.print("\u001B[48;2;13;94;175m    " + resetCode + "  " + "\u001B[48;2;13;94;175m    " + resetCode + "                      " + resetCode+"\n");
		System.out.print("          \u001B[48;2;13;94;175m                    " + resetCode+"\n");
		System.out.print("\u001B[48;2;13;94;175m    " + resetCode + "  " + "\u001B[48;2;13;94;175m    " + resetCode + "                      " + resetCode+"\n");
		System.out.print("\u001B[48;2;13;94;175m    " + resetCode + "  " + "\u001B[48;2;13;94;175m                        " + resetCode+"\n");
		for(int i = 0; i < 4; i++) {
			if(i%2==0)
				System.out.println();
			else
				System.out.println("\u001B[48;2;13;94;175m                              "+resetCode);
		}
		
		System.out.println();
		
		//Le françoise 💩
		
		for(int i = 0; i < 9; i++) {
			System.out.println("\u001B[48;2;4;30;153m          " + resetCode + "          " + "\u001B[48;2;229;4;50m          "+resetCode);
		}

		System.out.println();
		
		// ARRIBA ESPANIA
		for(int i = 0; i < 10; i++) {
			if(i>=3 && i<=6)
				System.out.println("\u001B[48;2;250;189;0m                              ");
			else
				System.out.println("\u001B[48;2;173;21;25m                              ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 9; i++) {
			if(i%2==0)
				System.out.println("\u001B[48;2;252;221;9m                              ");
			else
				System.out.println("\u001B[48;2;218;18;26m                              ");
		}

		System.out.println();
		
		for(int i = 0; i < 9; i++) {
			if(i<3)
				System.out.println("\u001B[40m                              ");
			else if(i >= 3 && i < 6)
				System.out.println("\u001B[48;2;230;38;27m                              ");
			else
				System.out.println("\u001B[48;2;252;204;0m                              ");
		}
	}
}
