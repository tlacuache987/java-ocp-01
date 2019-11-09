package com.example.lambda.employeesearch;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A06StreamData {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== Executive Count ==");
		long execCount = 0; // ??

		System.out.println("Exec count: " + execCount);

		System.out.println("\n== Highest Paid Exec ==");
		Optional highestExec = null; // ??

		if (highestExec.isPresent()) {
			Employee temp = null; // ??
			System.out.printf("Name: " + temp.getGivenName() + " " + temp.getSurName() + "   Salary: $%,6.2f %n ",
					temp.getSalary());
		}

		System.out.println("\n== Lowest Paid Staff ==");
		Optional lowestStaff = null; // ??

		if (lowestStaff.isPresent()) {
			Employee temp = null; // ??
			System.out.printf("Name: " + temp.getGivenName() + " " + temp.getSurName() + "   Salary: $%,6.2f %n ",
					temp.getSalary());
		}
	}
}
