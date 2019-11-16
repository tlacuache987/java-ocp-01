package com.example.nodestreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestNodeStreams {

	public static void main(String[] args) {
		
		args = new String[] { "TestNodeStreams-input.txt", "TestNodeStreams-output.txt" };

		// Test the arguments - there should be two
		if (args.length < 2) {
			System.out.println("Usage: java TestNodeStreams file1 file2\nBoth file names are required.");
			System.exit(-1);

		}

		// Set FileReader and FileWriter in try-catch-with-resources ??
		try (FileReader input = new FileReader(args[0]);
			 FileWriter output = new FileWriter(args[1])) {

			// read and write File ??
			char[] buffer = new char[2];
			int charsRead = 0;
			
			charsRead = input.read(buffer);
			
			System.out.println("chars readed 1st time: " + charsRead);
			
			while(charsRead != -1) {
				
				// write buffer to the output FileWriter
				output.write(buffer, 0, charsRead);
				
				charsRead = input.read(buffer);
				
				System.out.println("chars readed: " + charsRead);
			}
			

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}

		System.out.println("Success! Copied " + args[0] + " to " + args[1]);
	}
}