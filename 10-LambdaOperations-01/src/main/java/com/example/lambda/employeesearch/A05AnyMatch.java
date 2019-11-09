package com.example.lambda.employeesearch;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A05AnyMatch {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== First CO Bonus ==");

		boolean anyMatch = false; // ??
		
		if (anyMatch) {

			Optional<Employee> result = null; // ??

			if (result.isPresent()) {
				result.get().printSummary();
			}
		}

	}

}
