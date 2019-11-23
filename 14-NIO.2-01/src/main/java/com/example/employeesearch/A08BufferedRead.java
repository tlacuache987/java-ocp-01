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
		try {

			// Read lines and print all lines.
			// ??

		} catch (IOException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
