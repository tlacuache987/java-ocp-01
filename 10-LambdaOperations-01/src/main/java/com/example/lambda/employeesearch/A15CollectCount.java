package com.example.lambda.employeesearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A15CollectCount {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();

		Map<String, Long> gMap = new HashMap<>();

		// Collect CO Executives
		gMap = null; // ??

		System.out.println("\n== Employees by Dept ==");
		gMap.forEach((k, v) -> System.out.println("Dept: " + k + " Count: " + v));

	}

}
