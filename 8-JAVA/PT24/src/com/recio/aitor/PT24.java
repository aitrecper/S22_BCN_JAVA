package com.recio.aitor;

public class PT24 {

	public static void main(String[] args) {
		int altura = 10;
        int espacios = altura - 1;
        int asteriscos = 2;

        // Dibujar la parte superior del árbol
        for (int i = 0; i < altura; i++) {
            // Dibujar los espacios en cada nivel
            for (int j = 0; j < espacios; j++) {
                System.out.print("\033[49m \033[49m");
            }
            // Dibujar los asteriscos en cada nivel
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("\033[42m*\033[42m");
            }
            // Cambiar de línea después de cada nivel
            System.out.println();
            // Actualizar el número de espacios y asteriscos para el siguiente nivel
            espacios--;
            asteriscos += 2;
        }

        // Dibujar el tronco del árbol
        int alturaTronco = 2;
        int anchoTronco = 4;
        espacios = altura - 2;

        for (int i = 0; i < alturaTronco; i++) {
            // Dibujar los espacios del tronco
            for (int j = 0; j < espacios; j++) {
                System.out.print("\033[49m \033[49m");
            }
            // Dibujar los asteriscos del tronco
            for (int j = 0; j < anchoTronco; j++) {
                System.out.print("\033[40m*\033[40m");
            }
            // Cambiar de línea después de cada nivel
            System.out.println();
        }
	}
}
