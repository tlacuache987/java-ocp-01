package com.example.dateformat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {

		LocalDateTime today = LocalDateTime.now();
		
		// Define France Locale
		// ??

		// Add Locale to DateTimeFormatter
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); // ??

		// Print today with Locale.
		System.out.println("Date: " + today.format(df) + " Locale: " + null); // ??
	}
}