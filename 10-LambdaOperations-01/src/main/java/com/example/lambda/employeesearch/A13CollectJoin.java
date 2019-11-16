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

		String names = eList.stream()
			.filter(e -> e.getRole().equals(Role.EXECUTIVE))
			.filter(e -> e.getState().equals("CO"))
			.map( e -> e.getSurName() )
			.collect( Collectors.joining(", ") );
		
		System.out.println("\n== Names List ==");
		System.out.println("Names: " + names);
		
		// Collect All Dept Names
		String deptList = eList.stream()
				.map( e -> e.getDept() )
				.distinct()
				.collect( Collectors.joining(", ") ); // ??

		System.out.println("\n== Dept List ==");
		System.out.println("Total: " + deptList);

	}

}
