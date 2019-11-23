package com.example.employeesearch;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author oracle
 */
public class A04ComputeIfPresent {

	public static void main(String[] args) {

		Map<String, String> stMap = new LinkedHashMap<>(); // for keep insertion order

		stMap.put("WY", "Cheyenne");
		stMap.put("SD", "Pierre");
		stMap.put("CO", "Denver");

		// Compute if key "WY" is present on map, set value as value + " (Verified " + key + ")".
		// ??

		System.out.println("=== Print Map ===");

		stMap.forEach((k, v) -> System.out.println("Key: " + k + " " + "Value: " + v));

	}

}
