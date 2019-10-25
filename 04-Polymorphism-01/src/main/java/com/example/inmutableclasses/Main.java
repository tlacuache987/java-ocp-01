package com.example.inmutableclasses;

import java.util.Date;

public class Main {

	public static void main(String args[]) {

		Contacts contact1 = new Contacts("bradley", "cooper", "1234567899");

		System.out.println(contact1);

		Date today = new Date();
		BetterContact contact2 = new BetterContact("Frank", "Sinatra", today);

		System.out.println(contact2);

		today.setTime(today.getTime() - 999500000);

		System.out.println(contact2);
	}

	private static void tryModification(String fname, String lname, String mobile) {

		// HOW ?
		fname = "mike";
		lname = "peter";
		mobile = "99999999";
	}
}
