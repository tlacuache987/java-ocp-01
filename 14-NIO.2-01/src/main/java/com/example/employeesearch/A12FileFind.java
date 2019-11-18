package com.example.employeesearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A12FileFind {

	public static void main(String[] args) {

		// Find all directories in current Path "." with at most 9 top-down levels.
		// Use Files.find within a try-with-resources.
		try {

			// Print all Paths found.
			// ??

		} catch (IOException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
