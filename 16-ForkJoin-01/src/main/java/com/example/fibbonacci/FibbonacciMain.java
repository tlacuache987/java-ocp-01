package com.example.fibbonacci;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;

public class FibbonacciMain {

	public static void main(String[] args) {

		int number = 20; // 48th takes almost a minute, 50th takes 3.2 minutes

		int poolSize = Runtime.getRuntime().availableProcessors();

		ForkJoinPool pool = null; // ?? creates ForkJoinPool.

		Instant start = Instant.now();

		System.out.println("Parallelism  => " + pool.getParallelism());

		int result = -1; // ?? Invoke fibbonaci task computation.

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		System.out.println("finished in: " + duration.getSeconds() + " sec.");

		System.out.println(number + " the element of Fibonacci Number = " + result);
	}
}