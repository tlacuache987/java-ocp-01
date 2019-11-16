package com.example.exceptionclassmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionClassMethodsMain {

	public static void main(String[] args) { // delete throws

		// ?? Surround with try catch
		System.out.println("About to open a file");

		try {

			InputStream in = new FileInputStream("missingfile.txt");

		} catch (Exception e) { // Bad practice
			
			e.printStackTrace();
		}

		System.out.println("File open");

	}
}
