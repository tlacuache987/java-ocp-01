package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A04Parallel {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		double result = eList
				//.stream() // ?? remove
				.parallelStream()// ?? compute as parallelStream()
				.filter(e -> e.getState().equals("CO"))
				.filter(e -> e.getRole().equals(Role.EXECUTIVE))
				.peek(e -> e.printSummary())
				.mapToDouble(e -> e.getSalary())
				.sum();

		System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);

		System.out.println("\n");

		// Call parallel from pipeline
		result = eList.stream()
				.filter(e -> e.getState().equals("CO"))
				.filter(e -> e.getRole().equals(Role.EXECUTIVE))
				.peek(e -> e.printSummary())
				.mapToDouble(e -> e.getSalary())
				// ?? compute as parallel()
				.parallel()
				.sum();

		System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);

		System.out.println("\n");

		// Call sequential from pipeline
		result = eList.stream()
				.filter(e -> e.getState().equals("CO"))
				.filter(e -> e.getRole().equals(Role.EXECUTIVE))
				.peek(e -> e.printSummary())
				.mapToDouble(e -> e.getSalary())
				.sequential() // sequential computing is used by default
				.sum();

		System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);
	}
}
