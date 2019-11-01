package com.example.lambda.robocallexample;

import java.util.List;

/**
 * @author MikeW
 */
public class RoboCallTest04 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		RoboCall03 robo = new RoboCall03();

		System.out.println("\n==== Robo Test 03 ====");
		System.out.println("\n=== Calling all Drivers ===");

		robo.phoneContacts(pl); //??

		System.out.println("\n=== Emailing all Draftees ===");

		robo.emailContacts(pl); //??

		System.out.println("\n=== Mail all Pilots ===");

		robo.mailContacts(pl); //??

		System.out.println("\n=== Phone all Pilots ===");

		Pilots allPilots = new Pilots(); // Concrete class version
		robo.phoneContacts(pl); //??
	}
}
