package com.example.helper;

import com.example.domain.Employee;

public class EmployeeHelper {

	public static void foo(final Employee e) {
		e.setSalary(130_000.00);

		// e = new Employee();

		e.setSalary(140_000.00);
	}
}
