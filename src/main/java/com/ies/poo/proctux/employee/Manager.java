package com.ies.poo.proctux.employee;

public class Manager extends Employee {

	public Manager(String name, String register, Double baseSalary) {
		super(name, register, baseSalary);
	}
	
	@Override
	public Double calculateSalary() {
		return getBaseSalary() * 2;
	}
	
}
