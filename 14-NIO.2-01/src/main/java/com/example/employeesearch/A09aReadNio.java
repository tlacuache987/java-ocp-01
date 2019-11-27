package com.example.employeesearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A09aReadNio {
	
	public static final String basepath = "src/main/resources/";

	public static void main(String[] args) {

		// Read basepath + "tempest.txt" using Files.lines within a try-with-resources.
		
		try (Stream<String> lines = Files.lines(Paths.get(basepath).resolve("tempest.txt"))) {

			// Print all lines.
			lines
				.filter(s -> s.contains("PROSPERO"))
				.forEach(System.out::println);// ??

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}