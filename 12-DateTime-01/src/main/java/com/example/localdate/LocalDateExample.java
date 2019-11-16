package com.example.localdate;

import static java.lang.System.out;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.next;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate now, bDate, nowPlusMonth, nextTues;

		now = LocalDate.now(); // ??
		out.println("Now: " + now);

		bDate = LocalDate.of(1995, 5, 23); // ?? Java's Birthday
		out.println("Java's Bday: " + bDate);
		out.println("Is Java's Bday in the past? " + bDate.isBefore(now)); // ??
		out.println("Is Java's Bday in a leap year? " + bDate.isLeapYear()); // ??
		out.println("Java's Bday day of the week: " + bDate.getDayOfWeek()); // ??

		nowPlusMonth = now.plusMonths(2); // ??
		System.out.println("Now: " + now);
		out.println("The date a month from now: " + nowPlusMonth);

		nextTues = now.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)); // ??
		out.println("Next Tuesday's date: " + nextTues);
	}
}
