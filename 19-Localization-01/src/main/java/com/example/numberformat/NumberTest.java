package com.example.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

	public static void main(String[] args) {

		// Define a UK Locale
		Locale usLocale = Locale.US; // ??
		Locale frLocale = Locale.FRANCE; // ??
		Locale currentLocale = Locale.getDefault(); // ??
		Locale ukLocale = Locale.UK; // ??
		

		// Define a NumberFormat for currency in UK Locale
		NumberFormat usNf = NumberFormat.getCurrencyInstance(usLocale); // ??
		NumberFormat frNf = NumberFormat.getCurrencyInstance(frLocale); // ??
		NumberFormat currNf = NumberFormat.getCurrencyInstance(currentLocale); // ??
		NumberFormat ukNf = NumberFormat.getCurrencyInstance(ukLocale); // ??

		double money = 1_000_000.00d;

		System.out.println("Money: " + usNf.format(money) + " in Locale: " + usLocale);
		System.out.println("Money: " + frNf.format(money) + " in Locale: " + frLocale);
		System.out.println("Money: " + currNf.format(money) + " in Locale: " + currentLocale);
		System.out.println("Money: " + ukNf.format(money) + " in Locale: " + ukLocale);
	}
}
