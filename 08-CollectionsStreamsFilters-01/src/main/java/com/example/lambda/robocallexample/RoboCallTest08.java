package com.example.lambda.robocallexample;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCallTest08 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		RoboCall05 robo = new RoboCall05();

		// Define Predicates
		Predicate<Person> predicate = p -> p.getAge() >= 16;
		Consumer<Person> consumer = p -> robo.roboCall(p);

		System.out.println("\n=== Calling all Drivers Variable ===");

		// ?? call all drivers using stream -> filter -> forEach
		pl.stream().filter(predicate).forEach(consumer);

		pl.stream().filter(predicate).forEach(robo::roboCall);
	}

}
