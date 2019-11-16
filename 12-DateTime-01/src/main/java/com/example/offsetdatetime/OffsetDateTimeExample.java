package com.example.offsetdatetime;

import java.time.LocalDateTime;
import static java.time.Month.*;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OffsetDateTimeExample {

	public static void main(String[] args) {
		ZoneId SanFran = null; // ??
		ZoneId London = null; // ??

		LocalDateTime meeting = null; // ??
		ZonedDateTime staffCall = null; // ??

		OffsetDateTime staffCallOffset = null; // ??
		ZonedDateTime staffCallLondon = null; // ??

		// ZonedDateTime staffCallLondon = staffCall.withZoneSameInstant(London);
		System.out.println("Staff call (Pacific) is at: " + staffCall);
		System.out.println("Staff call (UK) is at:      " + staffCallLondon);
	}
}
