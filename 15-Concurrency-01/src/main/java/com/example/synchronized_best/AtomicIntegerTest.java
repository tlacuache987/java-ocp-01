package com.example.synchronized_best;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

	public static void main(String[] args) {

		ExecutorService executor = null; // ?? Define a new 8 fixed thread pool

		AnAtomicInteger counter = new AnAtomicInteger();

		for (int i = 0; i < 50; i++) {
			executor.submit(() -> System.out
					.println(Thread.currentThread().getName() + " Counter- " + counter.incrementAndGet()));
		}
		executor.shutdown();
	}
}

class AnAtomicInteger {

	private AtomicInteger counter = new AtomicInteger();

	public int incrementAndGet() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return counter.incrementAndGet();
	}
}