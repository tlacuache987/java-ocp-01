package com.example.lambda;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A07DetermineNot {
	
	// Just Analyze

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();
		
		Optional<Employee> e1 = eList.stream()
				.filter(e -> e.getRole().equals(Role.MANAGER))
				.sequential() // runs in sequential
				.findAny();

		Optional<Employee> e2 = eList.stream()
				.filter(e -> e.getRole().equals(Role.MANAGER))
				// ?? compute as parallel() // runs in parallel
				.findAny();

		System.out.println(e1.get().getGivenName() + " " + e1.get().getSurName());
		System.out.println(e2.get().getGivenName() + " " + e2.get().getSurName());
		
		// Non-deterministic operations
		System.out.println("The same: " + e1.get().getEmail().equals(e2.get().getEmail()));

	}
}
