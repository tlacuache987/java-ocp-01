package com.example.employeesearch;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A11FileWalk {

	public static void main(String[] args) {

		// Walk thru current Path "." and list all found Paths within a try-with-resurces.
		try (Stream<Path> files = Files.walk(Paths.get("."))) {

			// Print all Paths found.
			files.forEach(f -> System.out.println(f));// ??

		} catch (Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
