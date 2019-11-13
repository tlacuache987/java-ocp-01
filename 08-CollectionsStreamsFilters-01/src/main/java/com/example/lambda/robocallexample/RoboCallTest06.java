package com.example.lambda.robocallexample;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author MikeW
 */
public class RoboCallTest06 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();

		System.out.println("\n=== Print List ===");

		// ?? print person list using forEach
		// pl.forEach(p -> System.out.println(p));
		// pl.forEach(System.out::println);

		Consumer<Person> consumer = System.out::println;
		pl.forEach(consumer);
	}
}
