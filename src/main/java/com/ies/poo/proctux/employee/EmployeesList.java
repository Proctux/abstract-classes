package com.ies.poo.proctux.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeesList {
	private List<Employee> employees;

	public EmployeesList() {
		this.employees = new ArrayList<Employee>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public Double employeesTotalSalary() {
		return employees.stream().map(anEmployee -> anEmployee.calculateSalary()).reduce(0.0d, Double::sum);
	}
}
