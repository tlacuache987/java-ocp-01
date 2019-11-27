package com.example.employeesearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class A08BufferedRead {

	public static final String basepath = "src/main/resources/";

	public static void main(String[] args) {

		// Define a BufferedReader and read basepath + "tempest.txt" file in a try-with-resources
		try (BufferedReader bReader = new BufferedReader(new FileReader(basepath + "tempest.txt"))) {

			// Read lines and print all lines.
			bReader.lines()
				.filter(s -> s.contains("PROSPERO"))
				.forEach(System.out::println);// ??

		} catch (IOException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
