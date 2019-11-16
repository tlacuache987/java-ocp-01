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

		ZonedDateTime now = null; // ??
		DateTimeFormatter formatter = null; // ??
		
		System.out.println(now.format(formatter));

		formatter = null; // ??
		System.out.println(now.format(formatter));

		formatter = null; // ??
		System.out.println(now.format(formatter));

		formatter = null; // ??
		System.out.println(now.format(formatter));
	}
}
