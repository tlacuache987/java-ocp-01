package com.example.lambda.employeesearch;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A05BOptionalChain {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== First CO Bonus ==");
		
		String summary = eList.stream()
				.filter(e -> e.getRole().equals(Role.EXECUTIVE))
				//.peek(e -> System.out.println("Executive filtered"))
				.filter(e -> e.getState().equals("CO")) // ??
				.findFirst()
				.map(e -> e.getSummary()).orElse("No employee match");

		System.out.println(summary);
		
		System.out.println();
		
		String summary2 = eList.stream()
				.filter(e -> e.getRole().equals(Role.EXECUTIVE))
				//.peek(e -> System.out.println("Executive filtered"))
				.filter(e -> e.getState().equals("CO")) // ??
				.findFirst()
				.flatMap(e -> Optional.of(e.getSummary()))
				.orElse("No employee match");

		System.out.println(summary2);
	}
}
