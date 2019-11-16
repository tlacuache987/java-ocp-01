package com.example.nodestreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestNodeStreams {

	public static void main(String[] args) {

		// Test the arguments - there should be two
		if (args.length < 2) {
			System.out.println("Usage: java TestNodeStreams file1 file2\nBoth file names are required.");
			System.exit(-1);

		}

		// Set FileReader and FileWriter in try-catch-with-resources ??
		try {

			// read and write File ??

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}

		System.out.println("Success! Copied " + args[0] + " to " + args[1]);
	}
}