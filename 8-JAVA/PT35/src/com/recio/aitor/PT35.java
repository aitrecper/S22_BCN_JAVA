package com.recio.aitor;

public class PT35 {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Cliente", "Muy Original","12345678J", "A",1,96);
		Empleado e = new Empleado("Empleado Super", "Creativo También","13246579K","B","Indefinido",1350.0);
		
		c.generarCodigo();
		e.calcularSueldo();
	}
}
