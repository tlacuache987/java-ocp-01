package com.example.multicatchblocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MutlipeCatchBlocksMain {

	public static void main(String[] args) throws IOException { // delete throws

		// ?? Surround with try catch
		System.out.println("About to open a file");

		InputStream in = new FileInputStream("missingfile.txt");

		System.out.println("File open");

		int data = in.read();

		in.close();

	}
}