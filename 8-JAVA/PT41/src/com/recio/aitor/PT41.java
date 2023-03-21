package com.recio.aitor;

import java.util.Random;
import java.util.Scanner;

public class PT41 {
	
	private static Scanner sc = new Scanner(System.in);
	private static int plays=9, player1x, player1y, player2x, player2y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] game = {
				{" ","1","2","3"},
				{"1"," "," "," "},
				{"2"," "," "," "},
				{"3"," "," "," "},
		};

		boolean gameOn = true;
		
		int gameMode = showOptionMenu();
		
		
		if(gameMode == 1) {
			while(gameOn) {
				mostrarJuego(game);
				player1Play(game);
				
				gameOn = checkEnd(game);
				if(!gameOn) {
					break;
				}
				
				mostrarJuego(game);
				player2Play(game);
				
				gameOn = checkEnd(game);
			}
		}else if(gameMode == 2) {
			while(gameOn) {
				mostrarJuego(game);
				player1Play(game);
				
				gameOn = checkEnd(game);
				if(!gameOn) {
					break;
				}
				
				cpu2Play(game);
				mostrarJuego(game);
				gameOn = checkEnd(game);
			}
		}else {
			while(gameOn) {
				mostrarJuego(game);
				cpu1Play(game);
				
				gameOn = checkEnd(game);
				if(!gameOn) {
					break;
				}
				
				cpu2Play(game);
				mostrarJuego(game);
				gameOn = checkEnd(game);
			}
		}
		
	}

	private static int showOptionMenu() {
		int option = 0;
		do {
			System.out.print(
				"########## TRES EN RALLA ##########\n" +
				"1. Humano contra humano\n" + 
				"2. Humano contra CPU\n" + 
				"3. CPU contra CPU\n" + 
				"Elige: "
					);
			option = sc.nextInt();
		}while(option <= 0 || option > 3);
		
		return option;
	}
	
	private static void mostrarJuego(String[][] juego) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("|" + juego[i][j]);
			}
			System.out.print("|\n");
		}
	}
	
	private static void player1Play(String[][] game) {
		boolean playing = true, aux=false;
		
		while(playing) {
			System.out.println("Jugador X. Ingresa coordenadas (x,y) para colocar la pieza de uno en uno.");
			do {
				System.out.print("Ingresa X: ");
				player1x = sc.nextInt();
				if(player1x > 0 && player1x <= 3) {
					aux = true;
				}else {
					System.out.println("No es una coordenada válida, ingresa de nuevo");
				}
			}while(!aux);
			
			aux = false;
			
			do {
				System.out.print("Ingresa Y: ");
				player1y = sc.nextInt();
				if(player1y > 0 && player1y <= 3) {
					aux = true;
				}else {
					System.out.println("No es una coordenada válida, ingresa de nuevo");
				}
			}while(!aux);
			
			if(game[player1y][player1x].equals(" ")) {
				game[player1y][player1x] = "X";
				playing = false;
				plays--;
			}else {
				System.out.println("Ese sitio no es válido");
			}
		}
	}
	
	private static void player2Play(String[][] game) {
		boolean playing = true, aux=false;
		
		while(playing) {
			System.out.println("Jugador O. Ingresa coordenadas (x,y) para colocar la pieza de uno en uno.");
			do {
				System.out.print("Ingresa X: ");
				player1x = sc.nextInt();
				if(player1x > 0 && player1x <= 3) {
					aux = true;
				}else {
					System.out.println("No es una coordenada válida, ingresa de nuevo");
				}
			}while(!aux);
			
			aux = false;
			
			do {
				System.out.print("Ingresa Y: ");
				player1y = sc.nextInt();
				if(player1y > 0 && player1y <= 3) {
					aux = true;
				}else {
					System.out.println("No es una coordenada válida, ingresa de nuevo");
				}
			}while(!aux);
			
			if(game[player1y][player1x].equals(" ")) {
				game[player1y][player1x] = "O";
				playing = false;
				plays--;
			}else {
				System.out.println("Ese sitio no es válido");
			}
		}
	}
	
	private static void cpu1Play(String[][] game) {
		
		Random random = new Random();
		
		
		boolean playing = true, aux=false;
		while(playing) {
			do {
				
				player1x = random.nextInt(3) + 1;
				if(player1x > 0 && player1x <= 3) {
					aux = true;
				}
			}while(!aux);
			
			aux = false;
			
			do {
				player1y = random.nextInt(3) + 1;
				if(player1y > 0 && player1y <= 3) {
					aux = true;
				}
			}while(!aux);
			
			if(game[player1y][player1x].equals(" ")) {
				game[player1y][player1x] = "X";
				playing = false;
				plays--;
			}
		}
	}
	
private static void cpu2Play(String[][] game) {
		
		Random random = new Random();
		
		
		boolean playing = true, aux=false;
		while(playing) {
			do {
				
				player2x = random.nextInt(3) + 1;
				if(player2x > 0 && player2x <= 3) {
					aux = true;
				}
			}while(!aux);
			
			aux = false;
			
			do {
				player2y = random.nextInt(3) + 1;
				if(player2y > 0 && player2y <= 3) {
					aux = true;
				}
			}while(!aux);
			
			if(game[player2y][player2x].equals(" ")) {
				game[player2y][player2x] = "O";
				playing = false;
				plays--;
			}
		}
	}
	
	private static boolean checkEnd(String[][] game) {
		
		boolean gameOn = true; 
		if(game[1][1]==game[1][2] && game[1][1]==game[1][3] && !game[1][1].equals(" ")) {
			if(game[1][1].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(game[2][1]==game[2][2] && game[2][1]==game[2][3] && !game[2][1].equals(" ")) {
			if(game[2][1].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(game[3][1]==game[3][2] && game[3][1]==game[1][3] && !game[3][1].equals(" ")) {
			if(game[3][1].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(game[1][1]==game[2][1] && game[1][1]==game[3][1]  && !game[1][1].equals(" ")) {
			if(game[1][1].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(game[1][2]==game[2][2] && game[1][2]==game[3][2] && !game[1][2].equals(" ")) {
			if(game[1][2].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(game[1][3]==game[2][3] && game[1][1]==game[3][3] && !game[1][3].equals(" ")) {
			if(game[1][3].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(game[1][1]==game[2][2] && game[1][1]==game[3][3] && !game[1][1].equals(" ")) {
			if(game[1][1].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(game[1][3]==game[2][3] && game[1][1]==game[3][1] && !game[1][3].equals(" ")) {
			if(game[1][1].equals("X"))
				System.out.println("Gana el jugador X");
			else
				System.out.println("Gane el jugador O");
			gameOn = false;
		}else if(plays==0) {
			gameOn = false;
		}
		
		return gameOn;
	}
}
