package com.example.offsetdatetime;

import java.time.LocalDateTime;
import static java.time.Month.*;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OffsetDateTimeExample {

	public static void main(String[] args) {
		
		ZoneId losAngeles = ZoneId.of("America/Los_Angeles"); // ??
		ZoneId london = ZoneId.of("Europe/London"); // ??

		LocalDateTime meeting = LocalDate.of(2019, DECEMBER, 19).atTime(11,00); // ??
		ZonedDateTime staffCall = ZonedDateTime.of(meeting, losAngeles); // ??

		OffsetDateTime staffCallOffset = staffCall.toOffsetDateTime(); // ??
		
		ZonedDateTime staffCallLondon = staffCallOffset.atZoneSameInstant(london); // ??

		// ZonedDateTime staffCallLondon = staffCall.withZoneSameInstant(London);
		System.out.println("Staff call (Pacific) is at: " + staffCall);
		System.out.println("Staff call (UK) is at:      " + staffCallLondon);
	}
}
