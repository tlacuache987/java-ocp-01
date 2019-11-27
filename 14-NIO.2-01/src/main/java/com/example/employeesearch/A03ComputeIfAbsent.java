package com.example.employeesearch;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author oracle
 */
public class A03ComputeIfAbsent {

	private static final String placeHolder = "TBD";

	public static void main(String[] args) {

		Map<String, String> stMap = new LinkedHashMap<>();

		stMap.put("WY", "Cheyenne");
		stMap.put("SD", "Pierre");
		stMap.put("CO", "Denver");

		// Compute if key "AL" is absent on map, set value as "placeHolder".
		stMap.computeIfAbsent("AL", k -> placeHolder);// ??

		System.out.println("=== Print Map ===");

		// Iterate stMap
		stMap.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));// ??
	}
}
