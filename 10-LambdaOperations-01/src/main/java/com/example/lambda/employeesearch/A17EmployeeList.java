package com.example.lambda.employeesearch;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A17EmployeeList {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		// ??
		eList.forEach( Employee::printSummary );
	}
}
