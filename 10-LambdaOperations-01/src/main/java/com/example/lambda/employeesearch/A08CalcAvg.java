package com.example.lambda.employeesearch;

import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class A08CalcAvg {
	public static void main(String[] args) {
		List<Employee> eList = Employee.createShortList();

		System.out.println("\n== Average CO Bonus ==");
		OptionalDouble result;

		result = null; // ??

		if (result.isPresent()) {
			System.out.printf("Average Bonuses paid: $%,6.2f %n", result.getAsDouble());
		}

		System.out.println("\n== Average CO Bonus Details ==");

		result = null; // ??

		if (result.isPresent()) {
			System.out.printf("Average Bonuses paid: $%,6.2f %n", result.getAsDouble());
		}
	}
}