package com.example.employeesearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A13FlatMap {

	public static final String basepath = "src/main/resources/";
	
	public static void main(String[] args) {

		// Read basepath + "tempest.txt" file using Files.lines within try-with-resources.
		try (Stream<String> lines = Files.lines(Paths.get(basepath).resolve("tempest.txt"))) {

			// Use flatMap to split all lines in a new Strem of "words", spliting each line by " " (space character)
			// filter all words that contains "my", use peek to print each word filtered and then count all the ocurrences.
			long matches = lines.flatMap( line -> Stream.of(line.split(" ")) )
					.filter(w -> w.contains("the"))
					.peek(w -> System.out.println("match: " + w))
					.count(); // ??

			System.out.println("# of Matches: " + matches);
			
		} catch (IOException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}
