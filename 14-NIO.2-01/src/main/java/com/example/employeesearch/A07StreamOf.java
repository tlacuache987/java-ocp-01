package com.example.employeesearch;

import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A07StreamOf {
	
	public static void main(String[] args) {

		// Define a Stream of "Monday", "Tuesday", "Wedensday", "Thursday"
		// filter those starts with "T", and print it all.
		Stream.of("Monday", "Tuesday", "Wedensday", "Thursday")
				.filter(s -> s.startsWith("T"))
				.forEach(System.out::println);// ??
	}
}
