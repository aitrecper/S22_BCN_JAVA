package com.recio.aitor;

public class Cliente extends Persona {

	private int categoria;
	private int codigo;
	
	Cliente(String nombre, String apellidos, String documento, String tipo, int categoria, int codigo){
		super(nombre, apellidos, documento, tipo);
		this.categoria = categoria;
		this.codigo = codigo;
	}
	
	public void generarCodigo() {
		System.out.println(codigo);
	}
}
