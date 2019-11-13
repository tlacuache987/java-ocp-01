package com.example.lambda.robocallexample;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCallTest07 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		RoboCall05 robo = new RoboCall05();

		System.out.println("\n=== Calling all Drivers Lambda ===");
		
		// ?? call all drivers using stream -> filter -> forEach
		pl.stream()
			.filter(p -> p.getAge() >= 16)
			.forEach(p -> robo.roboCall(p));

		pl.stream()
			.filter(p -> p.getAge() >= 16)
			.forEach(robo::roboCall);
		
		Predicate<Person> consumer = RoboCallTest07::lala;
	}

	public static boolean lala(Person p) {
		System.out.println(p);
		return false;
	}
}
