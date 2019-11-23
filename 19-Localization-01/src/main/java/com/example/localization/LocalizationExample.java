package com.example.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExample {

	// Define three Locale objects for US, France, and default.

	private static Locale usLocale = null; // ??
	private static Locale frLocale = null; // ??
	private static Locale currentLocale = null; // ??

	public static void main(String[] args) {

		Locale locale = currentLocale;

		// Gets the ResourceBundle messages for basename "MyMessages".
		ResourceBundle messages = null; // ??

		System.out.println(messages.getString("idioma"));
		System.out.println("saludar en '" + messages.getString("idioma") + "' => " + messages.getString("saludo"));
		System.out.println("despedir en '" + messages.getString("idioma") + "' => " + messages.getString("despido"));

	}
}
