package com.example.synchronized_best;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleAtomicIntegerTest {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(8); // ?? Define a new 8 fixed thread pool

		AtomicInteger counter = new AtomicInteger(); // ?? Define a new Atomicinteger

		for (int i = 0; i < 10; i++) {
			executor.submit(() -> System.out
					.println(Thread.currentThread().getName() + " Counter- " + counter.incrementAndGet()));
		}

		executor.shutdown();
	}

}