package com.recio.aitor;

public class Empleado extends Persona {

	private String tipoContrato;
	private double sueldo;
	
	Empleado(String nombre, String apellidos, String documento, String tipo, String tipoContrato, double sueldo){
		super(nombre, apellidos, documento, tipo);
		this.tipoContrato = tipoContrato;
		this.sueldo = sueldo;
	}
	
	public void calcularSueldo() {
		System.out.println(sueldo);
	}
}
