package com.example.finally_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FinallyExampleMain {

	public static void main(String[] args) throws IOException { // delete throws

		// ?? Surround with try catch
		System.out.println("About to open a file");

		InputStream in = null;

		try {
			in = new FileInputStream("missingfile.txt");

			System.out.println("File open");

			int data = in.read();

		} catch (FileNotFoundException e) {

			System.err.println(e.getClass().getName());

			e.printStackTrace();

		} catch (IOException e) {

			System.err.println(e.getClass().getName());

			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}