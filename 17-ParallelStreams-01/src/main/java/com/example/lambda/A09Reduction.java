package com.example.lambda;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A09Reduction {
	
	// Just Analyze

	public static void main(String[] args) {
		
		int limit = 20;

		long r1 = LongStream.rangeClosed(1, limit)
				.sequential() // runs in sequential
				.reduce(1, (a, b) -> a * b);

		System.out.printf("Result: %,2d %n", r1);

		long r2 = LongStream.rangeClosed(1, limit)
				// ?? compute as parallel // runs in parallel
				.parallel()
				.reduce(1, (sum, element) -> sum * element);

		System.out.printf("Result: %,2d %n", r2);
		
		int limit2 = 500;
		
		BigInteger r3 = Stream
				.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
				.sequential() // runs in sequential
				.limit(limit2)
				.reduce(BigInteger.ONE, (sum, element) -> sum.multiply(element));

		System.out.printf("Result: %,2d %n", r3);
		
		BigInteger r4 = Stream
				.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
				// ?? compute as parallel // runs in parallel
				.parallel()
				.limit(limit2)
				.reduce(BigInteger.ONE, (sum, element) -> sum.multiply(element));

		System.out.printf("Result: %,2d %n", r4);

	}

}
