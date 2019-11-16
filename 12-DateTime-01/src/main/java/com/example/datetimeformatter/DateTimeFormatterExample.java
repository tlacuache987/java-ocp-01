/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.datetimeformatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author tmcginn
 */
public class DateTimeFormatterExample {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		ZonedDateTime now = ZonedDateTime.now(); // ??
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // ??
		
		System.out.println(now.format(formatter));

		formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); // ??
		System.out.println(now.format(formatter));

		formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy G, hh:mm a 'Q'q VV"); // ??
		System.out.println(now.format(formatter));

		formatter = DateTimeFormatter.ofPattern("'Ciudad de México a' dd 'de' MMMM 'del' YYYY', a las: 'hh:mm:ss a"); // ??
		System.out.println(now.format(formatter));
	}
}
