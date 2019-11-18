package com.example.listdirectory;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.PatternSyntaxException;

public class ListDirectory {

	public static void main(String[] args) {

		args = new String[] { ".", "*.xml" }; // ".*", "po*", *.xml"

		if (args.length < 1) {
			System.err.println("Usage: java ListDirectory <directory name> {<filter>}");
			System.exit(-1);
		}

		Path dir = null; // ??
		String filter = "*";

		if (args.length == 2) {
			filter = args[1];
		}

		// Use Files.newDirectoryStream to get a new DirectoryStream to find the filter pattern in
		// the directory Path. Use a try-with-resources.
		try {
			
			// Iterate DirectoryStream and print all Path filenames.
			// ??

		} catch (PatternSyntaxException | DirectoryIteratorException | IOException x) {
			// IOException can never be thrown by the iteration.
			// In this snippet, it can only be thrown by newDirectoryStream.
			System.err.println(x);
		}
	}
}