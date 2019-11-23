package com.example.employeesearch;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A06MapMerge {

	public static void main(String[] args) {

		Map<String, String> stMap = new LinkedHashMap<>();
		String message = " (Verified C State)";

		stMap.put("WY", "Cheyenne");
		stMap.put("SD", "Pierre");
		stMap.put("CO", "Denver");
		stMap.put("CA", "Sacramento");
		stMap.put("DE", "Dover");

		// Iterate Stream Key's, filter those starts with "C" and collect in a list.
		List<String> cList = null; // ??
		
		cList.forEach(System.out::println);
		
		System.out.println();

		// Iterate cList and merge those Key's with map (hard). 
		// ??
		
		stMap.forEach((k, v) -> System.out.println("Key: " + k + "  Value: " + v));
	}
}
