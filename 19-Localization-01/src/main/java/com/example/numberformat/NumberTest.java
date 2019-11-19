package com.example.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

	public static void main(String[] args) {

		// Define a UK Locale
		Locale loc = null; // ??

		// Define a NumberFormat for currency in UK Locale
		NumberFormat nf = null; // ??

		double money = 1_000_000.00d;

		System.out.println("Money: " + nf.format(money) + " in Locale: " + loc);
	}
}
