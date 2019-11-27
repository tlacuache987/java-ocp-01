package com.example.employeesearch;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A01RemoveIf {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		System.out.println("=== Starting List ===");

		eList.forEach(Employee::printSummary);

		System.out.println();

		// remove element if e.getState().equals("KS")
		eList.removeIf(employee -> employee.getState().equals("KS"));// ??

		System.out.println("=== Ending List ===");

		eList.forEach(Employee::printSummary);

	}
}
