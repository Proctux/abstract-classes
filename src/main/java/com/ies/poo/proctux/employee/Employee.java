package com.ies.poo.proctux.employee;

public abstract class Employee {
	private String name;
	private String register;
	private Double baseSalary;
	
	public Employee(String name, String register, Double baseSalary) {
		this.name = name;
		this.register = register;
		this.baseSalary = baseSalary;
	}
	
	public abstract Double calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
}
