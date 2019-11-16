package com.example.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TryCatchMain {

	public static void main(String[] args) { // delete throws

		// ?? Surround with try catch
		System.out.println("About to open a file");
		
		try {
			
			InputStream in = new FileInputStream("missingfile.txt");
			
			System.out.println("File open");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
