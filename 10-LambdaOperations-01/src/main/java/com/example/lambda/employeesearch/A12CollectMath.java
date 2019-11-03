package com.example.lambda.employeesearch;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A12CollectMath {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		// Collect CO Executives
		double avgSalary = 0; // ??

		System.out.println("\n== CO Exec Avg Salary ==");
		System.out.printf("Average: $%,9.2f %n", avgSalary);

	}

}
