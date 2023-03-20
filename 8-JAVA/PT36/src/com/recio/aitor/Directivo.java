package com.recio.aitor;

public class Directivo extends Empleado {

	Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Directivo [Nombre=" + getNombre() + "]";
	}

	
}
