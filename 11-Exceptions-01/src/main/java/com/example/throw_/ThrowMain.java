package com.example.throw_;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ThrowMain {

	public static void main(String[] args) throws IOException { // delete throws

		// ?? Surround with try catch

		int data = readByteFromFile();

	}

	public static int readByteFromFile() throws IOException {
		// ?? Surround with try catch and re-throws catched-exception
		File f = new File("a.txt");

		InputStream in = new FileInputStream(f);

		System.out.println("File open");

		if (f.length() > 250)
			throw new IOException("File too big");

		return in.read();

	}

}
