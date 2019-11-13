package com.example.lambda.employeesearch;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A04FindFirstLazy {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== First CO Bonus ==");

		Stream<Employee> stream = eList.stream()
				.filter(e -> e.getRole().equals(Role.EXECUTIVE))
				.peek(e -> System.out.println("Executive filtered"))
				.filter(e -> e.getState().equals("CO"));
		
		System.out.println("Hello im Lazy");
				
		Optional<Employee> result = stream.findFirst(); // ??

		if (result.isPresent()) {
			result.get().print();
		}
	}
}