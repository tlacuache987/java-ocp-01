package com.example.lambda;

import java.util.stream.IntStream;

/**
 *
 * @author oracle
 */
public class A08Reduction {
	
	// Just Analyze

	public static void main(String[] args) {

		int r1 = IntStream.rangeClosed(1, 5)
				.sequential() // runs in sequential
				.reduce(0, (a, b) -> a + b);

		System.out.println("Result: " + r1);

		int r2 = IntStream.rangeClosed(1, 5)
				// ?? compute as parallel // runs in parallel
				.reduce(0, (sum, element) -> sum + element);

		System.out.println("Result: " + r2);
		
		int r3 = IntStream.rangeClosed(1, 5)
				.sequential() // runs in sequential
				.sum();

		System.out.println("Result: " + r3);

		int r4 = IntStream.rangeClosed(1, 5)
				// ?? compute as parallel // runs in parallel
				.sum();

		System.out.println("Result: " + r4);

	}

}
