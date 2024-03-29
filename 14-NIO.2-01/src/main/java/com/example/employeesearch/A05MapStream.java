package com.example.employeesearch;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author oracle
 */
public class A05MapStream {

	public static void main(String[] args) {

		Map<String, String> stMap = new LinkedHashMap<>();

		stMap.put("WY", "Cheyenne");
		stMap.put("SD", "Pierre");
		stMap.put("CO", "Denver");
		stMap.put("CA", "Sacramento");
		stMap.put("DE", "Dover");

		// Iterate Stream Key's, filter those starting with "C" and print all.
		stMap.keySet().stream()
			.filter(k -> k.startsWith("C"))
			.forEach(s -> System.out.println("State: " + s));// ??

		System.out.println();

		// Iterate Stream Values, filter those starting with "D" and print all.
		stMap.values().stream()
			.filter(k -> k.startsWith("D"))
			.forEach(s -> System.out.println("City: " + s));// ??
	}

}
