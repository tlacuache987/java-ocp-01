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

		boolean anyMatch = eList.stream()
				.anyMatch(e -> e.getState().equals("CO")); // ??
		
		if (anyMatch) {

			Optional<Employee> result = eList.stream()
					.filter(e -> e.getState().equals("CO"))
					.findFirst(); // ??

			if (result.isPresent()) {
				result.get().printSummary();
			}
		}

	}

}
