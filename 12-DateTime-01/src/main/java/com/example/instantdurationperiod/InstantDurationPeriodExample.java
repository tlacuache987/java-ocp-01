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
import java.time.Period;
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
		Instant now = null; // ??

		Thread.sleep(0, 1);

		Instant later = null; // ??

		System.out.println("now is before later? " + null); // ??
		System.out.println("Now:   " + now);
		System.out.println("Later: " + later);
		System.out.println("");

		// Period
		Period oneDay = null; // ??

		System.out.println("Period of one day: " + oneDay);

		LocalDateTime beforeDST = null; // ??
		ZonedDateTime newYorkTime = null; // ??

		System.out.println("Before: " + newYorkTime);
		System.out.println("After:  " + null); // ??
		System.out.println("");

		// Duration
		Duration one24hourDay = null; // ??

		System.out.println("Duration of one day: " + one24hourDay);

		beforeDST = null; // ??
		newYorkTime = null; // ??

		System.out.println("Before: " + newYorkTime);
		System.out.println("After:  " + null); // ??
		System.out.println("");

		// Temporal
		LocalDate christmas = null; // ??
		LocalDate today = null; // ??

		long days = -1; // ??

		System.out.println("There are " + days + " shopping days til Christmas");

		Period tilXMas = null; // ??
		System.out.println(
				"There are " + tilXMas.getMonths() + " months and " + tilXMas.getDays() + " days til Christmas");
	}

}
