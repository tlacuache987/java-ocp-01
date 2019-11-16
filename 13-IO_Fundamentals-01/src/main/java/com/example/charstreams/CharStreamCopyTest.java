package com.example.charstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamCopyTest {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Usage: CharStreamCopyTest <original file> <copy>");
			System.exit(-1);

		}

		char[] c = new char[128];

		// Example use of InputStream methods
		// Set FileReader and FileWriter in try-catch-with-resources ??
		try {

			// read and write File ??

		} catch (FileNotFoundException f) {
			System.out.println("File " + args[0] + " not found.");

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}
	}
}
