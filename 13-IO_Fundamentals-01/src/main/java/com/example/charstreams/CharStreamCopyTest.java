package com.example.charstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamCopyTest {

	public static void main(String[] args) {
		
		args = new String[] { "CharStreamCopyTest-input.txt", "CharStreamCopyTest-output.txt" };

		if (args.length < 2) {
			System.out.println("Usage: CharStreamCopyTest <original file> <copy>");
			System.exit(-1);

		}

		// Example use of InputStream methods
		// Set FileReader and FileWriter in try-catch-with-resources ??
		try (FileReader input = new FileReader(args[0]); 
			 FileWriter output = new FileWriter(args[1])) {

			// read and write File ??
			char[] buffer = new char[2];
			int charsRead = 0;
			int count = 0;

			while ( (charsRead = input.read(buffer)) != -1) {
				System.out.println("chars readed: " + charsRead);
				count += charsRead;

				// write buffer to the output FileWriter
				output.write(buffer, 0, charsRead);
			}
			
			System.out.println("total chars readed: " + count);

		} catch (FileNotFoundException f) {
			System.out.println("File " + args[0] + " not found.");

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}
	}
}
