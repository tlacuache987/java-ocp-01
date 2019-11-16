package com.example.multicatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultiCatchMain {

	public static void main(String[] args) { // delete throws

		System.out.println("About to open a file");

		// ?? Surround with try-with-resources and multi-catch

		try (InputStream in = new FileInputStream("missingfile.tx"); 
				Scanner s = new Scanner(in)) {

			System.out.println("File open");

			int data = s.nextInt();

		} catch (FileNotFoundException | IllegalArgumentException e) {
			System.err.println(e.getClass().getName());
			e.printStackTrace();
			
		} catch (IOException | ClassCastException e) {
			System.err.println(e.getClass().getName());
			e.printStackTrace();
		}

	}
}