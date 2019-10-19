package com.example;

public class Employee2 {

	private int empId;
	private String name;
	private String ssn;
	private double salary;

	public Employee2() {
	}

	public void changeName(String newName) {
		if (newName != null) {
			this.name = newName;
		}
	}

	public void raiseSalary(double increase) {
		this.salary += increase;
	}
}
