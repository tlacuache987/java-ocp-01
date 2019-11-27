package com.example.employeesearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author oracle
 */
public class A09bReadAllNio {

	public static final String basepath = "src/main/resources/";

	public static void main(String[] args) {

		Path file = Paths.get(basepath).resolve("tempest.txt"); // ?? define Path basepath + "tempest.txt".
		
		List<String> fileArr;

		try {

			// Read all lines
			fileArr = Files.readAllLines(file); // ??

			// Iterate fileArr, filter those lines that contains "PROSPERO". Then print all lines.
			fileArr.stream()
				.filter(s -> s.contains("PROSPERO"))
				.forEach(System.out::println);// ??// ??

		} catch (IOException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
