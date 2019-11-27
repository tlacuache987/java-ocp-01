package com.example.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExample {

	// Define three Locale objects for US, France, and default.

	private static Locale usLocale = Locale.US; // ??
	private static Locale frLocale = Locale.FRANCE; // ??
	private static Locale currentLocale = Locale.getDefault(); // ??

	public static void main(String[] args) {

		Locale locale = frLocale;

		// Gets the ResourceBundle messages for basename "MyMessages".
		ResourceBundle messages = ResourceBundle
				.getBundle("MyMessages", locale); // ??

		System.out.println(messages.getString("idioma"));
		System.out.println("saludar en '" + messages.getString("idioma") + "' => " + messages.getString("saludo"));
		System.out.println("despedir en '" + messages.getString("idioma") + "' => " + messages.getString("despido"));

	}
}
