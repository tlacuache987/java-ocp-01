package com.example.localdatetime;

import static java.lang.System.out;
import static java.time.Month.MARCH;
import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime meeting, flight, courseStart, courseEnd;

		meeting = LocalDate.of(2019, Month.DECEMBER, 24).atTime(12, 30); // ??
		out.println("Meeting is on: " + meeting);

		LocalDate flightDate = LocalDate.of(2019, Month.DECEMBER, 24); // ??
		LocalTime flightTime = LocalTime.of(20, 45); // ??

		flight = LocalDateTime.of(flightDate, flightTime); // ??
		out.println("Flight leaves: " + flight);

		courseStart = LocalDateTime.of(2019, Month.OCTOBER, 19, 9, 00); // ??
		courseEnd = LocalDateTime.of(2019, Month.NOVEMBER, 23, 16, 00); // ??

		out.println("Course starts: " + courseStart);
		out.println("Course ends:   " + courseEnd);

		long courseHrs = (courseEnd.getHour() - courseStart.getHour()) * (courseStart.until(courseEnd, DAYS) + 1);
		out.println("Course is:     " + courseHrs + " hours long.");
	}

}
