package com.recio.aitor;

public class Oficial extends Operario {

	Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Oficial [Nombre=" + getNombre() + "]";
	}
	
}
