package com.example.finally_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FinallyExampleMain {

	public static void main(String[] args) throws IOException { // delete throws

		InputStream in = null;

		// ?? Surround with try catch
		System.out.println("About to open a file");

		in = new FileInputStream("missingfile.txt");

		System.out.println("File open");

		int data = in.read();

		// ?? add a finally statement
	}
}