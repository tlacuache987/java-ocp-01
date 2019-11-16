package com.example.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyTest {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Usage: ByteStreamCopyTest <original file> <copy>");
			System.exit(-1);

		}

		byte[] b = new byte[128];

		// Example use of InputStream methods
		// Set FileInputStream and FileOutputStream in try-catch-with-resources ??
		try {

			// read and write File ??

		} catch (FileNotFoundException f) {
			System.out.println("File not found: " + f);

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}
	}
}
