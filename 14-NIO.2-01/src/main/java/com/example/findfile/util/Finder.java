package com.example.findfile.util;

import static java.nio.file.FileVisitResult.CONTINUE;

import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Finder extends SimpleFileVisitor<Path> {
	
	// Just Analyze

	private Path file;
	private PathMatcher matcher;
	private int numMatches;
	private List<Path> paths;
	private boolean printPaths;

	public Finder(Path file, String pattern, boolean printPaths) {
		this.matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
		this.file = file;
		this.paths = new ArrayList<>();
		this.printPaths = printPaths;
	}

	// Compares the glob pattern against the file or directory name.
	private void find(Path file) {

		if (file.getFileName() != null && matcher.matches(file.getFileName())) {

			numMatches++;

			paths.add(file);

			if (printPaths)
				System.out.println(file);
		}

	}

	// Prints the total number of matches to standard out.
	public void done() {

		System.out.println("Matched: " + numMatches);
	}

	public List<Path> getMatchedPaths() {

		return this.paths;
	}

	// Invoke the pattern matching method on each file.
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

		find(file);

		return CONTINUE;
	}

	// Invoke the pattern matching method on each directory.
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {

		find(dir);

		return CONTINUE;
	}
}