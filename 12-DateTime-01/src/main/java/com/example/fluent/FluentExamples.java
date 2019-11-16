/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.fluent;

import static java.time.Month.JUNE;
import static java.time.Month.MARCH;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author tmcginn
 */
public class FluentExamples {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		// Not very readable - is this June 11 or November 6th?
		LocalDate myBday = LocalDate.of(1987, 6, 23);

		// A fluent approach
		myBday = Year.of(1987).atMonth(JUNE).atDay(23); // ??

		DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); // ??
		
		System.out.println("My Birthday: " + myBday.format(format));
		
		format = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); // ??

		// Schedule a meeting fluently
		LocalDateTime meeting = LocalDateTime.of(2019, Month.OCTOBER, 23, 15, 45); // ??
		System.out.println("meeting:      " + meeting.format(format));

		// Schedule that meeting using the London timezone
		ZoneId zone = ZoneId.of("Europe/London");
		ZonedDateTime meetingUK = meeting.atZone(zone); // ??
		System.out.println("meetingUK:    " + meetingUK.format(format));

		// What time is in Fiji for that meeting?
		ZonedDateTime earlyMeeting = meetingUK.withZoneSameInstant(ZoneId.of("Pacific/Fiji")); // ??
		System.out.println("earlyMeeting: " + earlyMeeting.format(format));
		
		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

	}

}
