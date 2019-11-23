package com.example.copystream;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class CopyStream {

	public static void main(String[] args) {

		args = new String[] { "https://www.oracle.com/mx/java/", "CopyStream-oracle-mx-java.html"};
		
		if (args.length < 2) {
			System.err.println("Usage: java CopyStream <URL> <file>");
			System.err.println("CopyStream copies a web page to a file.");
			System.exit(-1);
		}

		// Open the file to write to
		Path path = null; // ??
		URI u = null; // ??

		// Define InputStream from URI in try-with-resources
		try {
			
			// Copy URL content to destination Path
			// ??

		} catch (IOException e) {
			System.err.println("Exception: " + e);
		}
	}
}