package com.example.employeesearch;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author oracle
 */
public class A02ReplaceAll {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("=== Starting List ===");

		eList.forEach(Employee::printSummary);

		System.out.println();

		// replace all employee elements with public static Employee buildEmployee(Employee e);
		eList.replaceAll( A02ReplaceAll::buildEmployee );// ??

		System.out.println("\n=== Ending List ===");

		eList.forEach(Employee::printSummary);

	}

	public static Employee buildEmployee(Employee e) { // this employee is the one we get on the unary operator...
		//System.out.println(e);
		return new Employee.Builder().givenName("Bob").surName("Baker").age(23).gender(Gender.MALE).role(Role.STAFF)
				.dept("Eng").startDate(LocalDate.of(2013, 1, 10)).salary(40000).email("bob.baker@example.com")
				.phoneNumber("201-121-4678").address("44 4th St").city("Smallville").state("KS").code("12333").build();
	}
}
