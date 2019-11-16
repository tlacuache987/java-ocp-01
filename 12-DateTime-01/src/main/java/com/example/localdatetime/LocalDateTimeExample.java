package com.example.localdatetime;

import static java.lang.System.out;
import static java.time.Month.MARCH;
import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime meeting, flight, courseStart, courseEnd;

		meeting = null; // ??
		out.println("Meeting is on: " + meeting);

		LocalDate flightDate = null; // ??
		LocalTime flightTime = null; // ??

		flight = null; // ??
		out.println("Flight leaves: " + flight);

		courseStart = null; // ??
		courseEnd = null; // ??

		out.println("Course starts: " + courseStart);
		out.println("Course ends:   " + courseEnd);

		long courseHrs = (courseEnd.getHour() - courseStart.getHour()) * (courseStart.until(courseEnd, DAYS) + 1);
		out.println("Course is:     " + courseHrs + " hours long.");
	}

}
