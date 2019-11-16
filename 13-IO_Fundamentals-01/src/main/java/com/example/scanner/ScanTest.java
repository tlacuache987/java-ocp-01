package com.example.scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("ScanTest usage: java ScanTest file");
			System.exit(-1);

		}

		// Set FileReader with BufferedReader and Scanner in try-catch-with-resources ??
		try {

			// read scanner ??

		} catch (IOException e) {
			System.out.println("Exception: " + e);

		}

	}
}