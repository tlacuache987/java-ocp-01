package com.example.findfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.example.findfile.util.Finder;

public class FindFileTest {

	public static void main(String[] args) {

		args = new String[] { ".", "**.{java}" }; // "**.{java}", "*", "DiskUsage.java"

		if (args.length < 2) {
			System.out.println("Usage: FindFileTest <start path> <search string>");
			System.exit(-1);
		}

		Path root = null; // ??
		String pattern = null; // ??

		boolean isDirectory = false; // ??
		if (!isDirectory) {
			System.out.println(args[0] + " must be a directory!");
			System.exit(-1);
		}

		Finder finder = new Finder(root, pattern, false);

		try {

			// Walk thru root files finding files that matches pattern.
			// ??

			finder.done();

			System.out.println();

			finder.getMatchedPaths().stream().forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Exception: " + e);
		}

	}
}