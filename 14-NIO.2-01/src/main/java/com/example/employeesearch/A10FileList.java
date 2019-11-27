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
public class A10FileList {

	public static void main(String[] args) {

		// List files in current Path "." using Files.list within try-with-resources.
		try (Stream<Path> files = Files.list(Paths.get("."))) {

			// Print each file listed.
			files.forEach(f -> System.out.println(f)); // ??

		} catch (IOException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
