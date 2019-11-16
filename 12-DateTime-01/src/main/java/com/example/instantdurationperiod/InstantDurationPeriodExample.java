/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.instantdurationperiod;

import static java.time.Month.DECEMBER;
import static java.time.Month.MARCH;
import static java.time.temporal.ChronoUnit.DAYS;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author tmcginn
 */
public class InstantDurationPeriodExample {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws InterruptedException {

		// Instant
		Instant now = Instant.now(); // ??

		Thread.sleep(1, 1);

		Instant later = Instant.now(); // ??

		System.out.println("now is before later? " + now.isBefore(later)); // ??
		System.out.println("Now:   " + now);
		System.out.println("Later: " + later);
		System.out.println("");

		// Period
		Period twoDays = Period.ofDays(2); // ??

		System.out.println("Period of two days: " + twoDays);

		LocalDateTime beforeDST = LocalDateTime.of(2019, MARCH, 9, 12, 00); // ??
		ZonedDateTime newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York")); // ??

		System.out.println("Before: " + newYorkTime);
		System.out.println("After:  " + newYorkTime.plus(twoDays)); // ??
		System.out.println("");

		// Duration
		Duration twoDays48Hours = Duration.ofDays(2); // ??

		System.out.println("Duration of two days: " + twoDays48Hours);

		beforeDST = LocalDateTime.of(2019, MARCH, 9, 12, 00); // ??
		newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York")); // ??

		System.out.println("Before: " + newYorkTime);
		System.out.println("After:  " + newYorkTime.plus(twoDays48Hours)); // ??
		System.out.println("");

		// Temporal
		LocalDate christmas = Year.of(2019).atMonth(DECEMBER).atDay(25); // ??
		LocalDate today = LocalDate.now(); // ??

		long days = DAYS.between(today, christmas); // ??

		System.out.println("There are " + days + " shopping days til Christmas");

		Period tilXMas = Period.between(today, christmas); // ??
		System.out.println(
				"There are " + tilXMas.getMonths() + " months and " + tilXMas.getDays() + " days til Christmas");
	}

}
