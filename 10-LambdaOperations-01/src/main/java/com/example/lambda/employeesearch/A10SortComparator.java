package com.example.lambda.employeesearch;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author oracle
 */
public class A10SortComparator {
	public static void main(String[] args) {
		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== CO Bonus Details Comparator ==");

		// ??
		eList.stream()
			.filter(e -> e.getRole().equals(Role.EXECUTIVE))
			.filter(e -> e.getState().equals("CO"))
			.sorted(Comparator.comparing(e -> e.getSurName()))
			.forEach(e -> System.out.println("Employee: " + e.getSurName())); // ??

		System.out.println("\n== CO Bonus Details Reversed ==");

		eList.stream()
			.filter(e -> e.getRole().equals(Role.EXECUTIVE))
			.filter(e -> e.getState().equals("CO"))
			.sorted(Comparator.comparing(Employee::getSurName).reversed())
			.forEach(e -> System.out.println("Employee: " + e.getSurName())); // ??

		System.out.println("\n== Two Level Sort, Dept then Surname ==");

		eList.stream()
			.filter(e -> e.getRole().equals(Role.EXECUTIVE))
			.filter(e -> e.getState().equals("CO"))
			.sorted(
					Comparator
						.comparing(Employee::getDept)
						.thenComparing(Employee::getSurName)
			)
			.forEach(e -> System.out.println("Dept: "+e.getDept()+", Employee: " + e.getSurName())); // ??
	}
}
