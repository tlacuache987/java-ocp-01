package com.example.bufferedstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamCopyTest {

	public static void main(String[] args) {

		// Test the arguments - there should be two
		if (args.length < 2) {
			System.out.println("Usage: java TestNodeStreams file1 file2\nBoth file names are required.");
			System.exit(-1);

		}

		// Set BufferedReader and BufferedWriter in try-catch-with-resources ??
		try {

			String line = "";

			// read the first line ??
			

		} catch (FileNotFoundException f) {
			System.out.println("File not found: " + f);

		} catch (IOException e) {
			System.out.println("Exception: " + e);

		}
	}
}