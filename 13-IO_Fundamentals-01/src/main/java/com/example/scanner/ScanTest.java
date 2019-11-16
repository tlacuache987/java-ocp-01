package com.example.scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		
		args = new String[] { "ScanTest-input.txt" };

		if (args.length < 1) {
			System.out.println("ScanTest usage: java ScanTest file");
			System.exit(-1);

		}

		// Set FileReader with BufferedReader and Scanner in try-catch-with-resources ??
		try (FileReader fr = new FileReader(args[0]);
			 BufferedReader br = new BufferedReader(fr);
			 Scanner scanner = new Scanner(br);) {

			// read scanner ??
			scanner.useDelimiter("\\W");
			
			while(scanner.hasNext()) {
				System.out.println(scanner.next().trim());
			}

		} catch (IOException e) {
			System.out.println("Exception: " + e);

		}

	}
}