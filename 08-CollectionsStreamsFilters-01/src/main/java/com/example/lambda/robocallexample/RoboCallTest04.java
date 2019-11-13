package com.example.lambda.robocallexample;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author MikeW
 */
public class RoboCallTest04 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		RoboCall03 robo = new RoboCall03();

		System.out.println("\n==== Robo Test 03 ====");
		System.out.println("\n=== Calling all Drivers ===");

		robo.phoneContacts(pl, (Person p) -> {
			return p.getAge() >= 16;
		}); // ??

		System.out.println("\n=== Emailing all Draftees ===");

		robo.emailContacts(pl, (Person p) -> {
			return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
		}); // ??

		System.out.println("\n=== Mail all Pilots ===");

		robo.mailContacts(pl, (Person p) -> {
			return p.getAge() >= 23 && p.getAge() <= 65;
		}); // ??

		System.out.println("\n=== Phone all Pilots ===");

		Predicate<Person> allPilots = new Pilots(); // Concrete class version
		robo.phoneContacts(pl, allPilots); // ??
	}

}
