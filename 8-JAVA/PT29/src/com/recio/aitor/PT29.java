package com.recio.aitor;

public class PT29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno[] alumnos = {
			new Alumno("Aitor", "Recio Pérez", "S_22_JAVA",1),
			new Alumno("Fulanito", "de Tal", "ESO",3),
			new Alumno("Eduardo", "Manostijeras", "Peluquería y estilismo",2),
			new Alumno("Frankenstein", "Doctor", "Física",4),
		};
		
		System.out.printf("%30s%30s%30s%30s%n", "Nombre ", "Apellido", "Curso", "Año");
		System.out.println("\t-----------------------------------------------------------------------------------------------------------------");
		for (Alumno alumno : alumnos) {
			System.out.printf("%30s%30s%30s%30s%n", alumno.name, alumno.surname, alumno.course, alumno.year);
		}

		System.out.printf("%-30s%-30s%-30s%-30s%n", "Nombre ", "Apellido", "Curso", "Año");
		System.out.println("--------------------------------------------------------------------------------------------");
		for (Alumno alumno : alumnos) {
			System.out.printf("%-30s%-30s%-30s%-30s%n", alumno.name, alumno.surname, alumno.course, alumno.year);
		}
		
	}

}

class Alumno{
	
	String name;
	String surname;
	String course;
	int year;
	
	Alumno(String name, String surname, String course, int year){
		this.name = name;
		this.surname = surname;
		this.course = course;
		this.year = year;
	}
}