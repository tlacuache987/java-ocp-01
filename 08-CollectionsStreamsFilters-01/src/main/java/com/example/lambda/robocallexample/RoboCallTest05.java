package com.example.lambda.robocallexample;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCallTest05 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		RoboCall05 robo = new RoboCall05();

		// Define predicates Predicates
		

		System.out.println("\n==== Robo Test 04 ====");
		System.out.println("\n=== Calling all Drivers ===");
		robo.phoneContacts(pl, null);

		System.out.println("\n=== Emailing all Draftees ===");
		robo.emailContacts(pl, null);

		System.out.println("\n=== Mail all Pilots ===");
		robo.mailContacts(pl, null);

	}
}
