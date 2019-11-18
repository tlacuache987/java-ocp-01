package com.example.copyalllines;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import static java.nio.file.StandardOpenOption.*;

public class CopyAllLinesTest {

	private boolean overwrite = false;
	private Path source = null;
	private Path target = null;

	public static void main(String[] args) {

		args = new String[] { "-o", "CopyAllLinesTest-file-input.txt", "CopyAllLinesTest-file-output.txt" };

		CopyAllLinesTest copy = new CopyAllLinesTest();
		copy.checkArguments(args);

		try {
			copy.copyFile();

			System.out.println("Successfully copied!");

		} catch (IOException i) {
			System.out.println("Exception thrown: " + i);
		}
	}

	private void copyFile() throws IOException {

		List<String> fileLines = null;
		Charset cs = Charset.defaultCharset();

		// Read the entire file into the List
		fileLines = null; // ??

		// Write the lines back out
		// ??
	}

	private void checkArguments(String args[]) {

		// Check for a minimum of two arguments
		if (args.length < 2) {
			System.out.println("Not enough arguments.");
			usage();
		}

		// If there are three arguments, check for the option to overwrite
		if (args.length == 3) {

			if (!args[0].equals("-o")) {
				System.out.println("Check for the proper options.");
				usage();

			} else {
				overwrite = true;
				source = null; // ??
				target = null; // ??
			}

			// Else there are two - assume they are source and target file
		} else {
			source = null; // ??
			target = null; // ??
		}

		// check that the source is a file
		boolean isDirectory = false; // ??
		if (isDirectory) {
			System.out.println(source + " must be a file!");
			usage();
		}

		// check that the target does not exist, or we can overwrite it
		boolean fileExists = false; // ??
		if (fileExists && !overwrite) {
			System.out.println("Target file " + target.getFileName()
					+ " exists. Use the -o option to overwrite or delete <trget file>.");
			usage();
		}
	}

	private void usage() {
		System.out.println("Usage: CopyAllLinesTest {-o} <source file> <target file>");
		System.exit(-1);
	}
}