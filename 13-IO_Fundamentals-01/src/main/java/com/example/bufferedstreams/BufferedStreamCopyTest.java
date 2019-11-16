package com.example.bufferedstreams;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamCopyTest {

	public static void main(String[] args) {
		
		args = new String[] { "BufferedStreamCopyTest-input.txt", "BufferedStreamCopyTest-output.txt" };

		// Test the arguments - there should be two
		if (args.length < 2) {
			System.out.println("Usage: java BufferedStreamCopyTest file1 file2\nBoth file names are required.");
			System.exit(-1);

		}

		// Set BufferedReader and BufferedWriter in try-catch-with-resources ??
		try (BufferedReader bufferReader = new BufferedReader(new FileReader(args[0]));
			  BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(args[1]))) {

			String line = "";

			// read the first line ??
			while((line = bufferReader.readLine()) != null){
				
				// write line to the output writer
				bufferWriter.write(line);
				bufferWriter.newLine();
			}

		} catch (FileNotFoundException f) {
			System.out.println("File not found: " + f);

		} catch (IOException e) {
			System.out.println("Exception: " + e);

		}
	}
}