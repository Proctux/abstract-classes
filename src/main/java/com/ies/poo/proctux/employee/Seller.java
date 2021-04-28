package com.ies.poo.proctux.employee;

public class Seller extends Employee {
	private Double commission;

	public Seller(String name, String register, Double baseSalary, Double commission) {
		super(name, register, baseSalary);
		this.commission = commission;
	}
	
	@Override
	public Double calculateSalary() {
		return getBaseSalary() + commission;
	}
}
