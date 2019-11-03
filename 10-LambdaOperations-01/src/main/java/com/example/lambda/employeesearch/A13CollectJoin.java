package com.example.lambda.employeesearch;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A13CollectJoin {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		// Collect CO Executives
		String deptList = null; // ??

		System.out.println("\n== Dept List ==");
		System.out.println("Total: " + deptList);

	}

}
