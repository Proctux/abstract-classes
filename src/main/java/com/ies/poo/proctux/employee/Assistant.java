package com.ies.poo.proctux.employee;

public class Assistant extends Employee {

	public Assistant(String name, String register, Double baseSalary) {
		super(name, register, baseSalary);
	}
	
	@Override
	public Double calculateSalary() {
		return getBaseSalary();
	}
	
}
