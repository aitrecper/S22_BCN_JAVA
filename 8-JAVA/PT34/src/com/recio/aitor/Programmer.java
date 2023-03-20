package com.recio.aitor;

public class Programmer extends Employee {

	public int bonus;
	
	Programmer(float salary,int bonus){
		super(salary);
		this.bonus = bonus;
	}
	
	public void getSalary() {
		System.out.println(super.salary+bonus);
	}
	
}
