package com.example.synchronized_best;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonAtomicIntegerTest {

	public static void main(String[] args) {

		ExecutorService executor = null; // ?? Define a new 8 fixed thread pool

		NonAtomicInteger counter = new NonAtomicInteger();

		for (int i = 0; i < 50; i++) {
			executor.submit(() -> System.out
					.println(Thread.currentThread().getName() + " Counter- " + counter.incrementAndGet()));
		}
		executor.shutdown();
	}
}

class NonAtomicInteger {

	private int counter = 0;

	public int incrementAndGet() { // syncronize for reach atomic operation
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return ++counter;
	}
}