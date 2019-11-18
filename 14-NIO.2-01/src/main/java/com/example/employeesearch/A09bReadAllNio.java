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

		Path file = null; // ?? define Path basepath + "tempest.txt".
		
		List<String> fileArr;

		try {

			// Read all lines
			fileArr = null; // ??

			// Iterate fileArr, filter those lines that contains "PROSPERO". Then print all lines.
			// ??

		} catch (IOException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
