package com.example;

import static com.example.helper.EmployeeHelper.foo;

import com.example.domain.Employee;

public class ObjectPassTest {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setSalary(120_000.00);

		foo(e);

		System.out.println("Employee Salary: " + e.getSalary());

	}

}
