package com.example.exceptionclassmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionClassMethodsMain {

	public static void main(String[] args) throws FileNotFoundException { // delete throws

		// ?? Surround with try catch
		System.out.println("About to open a file");

		InputStream in = new FileInputStream("missingfile.txt");

		System.out.println("File open");

	}
}
