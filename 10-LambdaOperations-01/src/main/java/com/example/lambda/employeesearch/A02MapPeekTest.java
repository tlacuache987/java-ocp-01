package com.example.lambda.employeesearch;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A02MapPeekTest {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== Executive CO Bonuses ==");
		// ??
		eList.stream()
			.filter(e -> e.getRole().equals(Role.EXECUTIVE))
			.filter(e -> e.getState().equals("CO"))
			.peek(e -> System.out.print("Employee: " + e.getGivenName()))
			.map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
			.forEach(bonus -> System.out.printf(", Bonus paid: $%,.2f %n", bonus));

		System.out.println("\n== Eng Manager Bonus ==");
		// ??
		eList.stream()
			.filter(e -> e.getRole().equals(Role.MANAGER))
			.filter(e -> e.getDept().equals("Eng"))
			.peek(e -> System.out.print("Employee: " + e.getGivenName()))
			.map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
			.forEach(bonus -> System.out.printf(", Bonus paid: $%,.2f %n", bonus));
	}
}