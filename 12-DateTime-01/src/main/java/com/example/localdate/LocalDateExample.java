package com.example.localdate;

import static java.lang.System.out;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.next;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate now, bDate, nowPlusMonth, nextTues;

		now = null; // ??
		out.println("Now: " + now);

		bDate = null; // ?? Java's Birthday
		out.println("Java's Bday: " + bDate);
		out.println("Is Java's Bday in the past? " + null); // ??
		out.println("Is Java's Bday in a leap year? " + null); // ??
		out.println("Java's Bday day of the week: " + null); // ??

		nowPlusMonth = null; // ??
		System.out.println("Now: " + now);
		out.println("The date a month from now: " + nowPlusMonth);

		nextTues = null; // ??
		out.println("Next Tuesday's date: " + nextTues);
	}
}
