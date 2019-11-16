package com.example.localtime;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;
import static java.lang.System.out;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime now, nowPlus, nowHrsMins, lunch, bedtime;

		now = null; // ??

		out.println("The time now is: " + now);

		nowPlus = null; // ??

		out.println("What time is it 1 hour 15 minutes from now? " + nowPlus);

		nowHrsMins = null; // ??

		out.println("Truncate the current time to minutes: " + nowHrsMins);

		out.println("It is the " + now.toSecondOfDay() / 60 + "th minute of the day.");

		lunch = null; // ??

		out.println("Is lunch in my future? " + null); // ??

		long minsToLunch = -1; // ??
		out.println("Minutes til lunch: " + minsToLunch);

		bedtime = null; // ??

		long hrsToBedtime = -1; // ??
		out.println("How many hours until bedtime? " + hrsToBedtime);
	}
}
