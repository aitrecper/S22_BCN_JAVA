package com.recio.aitor;

import recio.aitor.HolaMundo;
import recio.aitor.HastaNunqui;
//import recio.aitor.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HolaMundo hm = new HolaMundo();
		
		hm.saludar();
		
		HastaNunqui hn = new HastaNunqui();
		
		hn.patada();
		
		//Como hemos hecho el import solo de la clase HolaMundo no nos deja usar HastaNunqui, pero para ello
		//importamos la clase también, o del otro modo, aunque menos óptimo, importar todo el paquete
	}

}
