package com.example.lambda.employeesearch;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A04FindFirstLazy {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== CO Bonuses ==");
		// ??

		System.out.println("\n== First CO Bonus ==");
		
		Optional<Employee> result = null; // ??

		if (result.isPresent()) {
			result.get().printSummary();
		}
	}
}