package com.example.throws_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ThrowsMain {

	public static void main(String[] args) { // delete throws

		// ?? Surround with try catch
		try {

			int data = readByteFromFile();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static int readByteFromFile() throws IOException {

		// ?? Surround with try-with-resources and multi-catch
		try (InputStream in = new FileInputStream("a.txt")) {
			System.out.println("File open");
			return in.read();
		}
	}
}