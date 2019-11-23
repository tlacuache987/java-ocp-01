package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A06Determine {
	
	// Just Analyze

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		double r1 = eList.stream()
				.filter(e -> e.getState().equals("CO"))
				.mapToDouble(Employee::getSalary)
				.sequential() // ?? sequential
				.sum();

		double r2 = eList.stream()
				.filter(e -> e.getState().equals("CO"))
				.mapToDouble(Employee::getSalary)
				// ?? compute as parallel()
				.sum();

		// Deterministic operations
		System.out.println("The same: " + (r1 == r2));
	}
}
