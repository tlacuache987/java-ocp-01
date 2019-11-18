package com.example.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

	// Just Analyze

	public static void main(String[] args) {

		AtomicInteger ai = new AtomicInteger(5);

		System.out.println("Value: " + ai.get());
		System.out.println("New value: " + ai.incrementAndGet());
		System.out.println("Same value: " + ai.getAndIncrement());
		System.out.println("New value: " + ai.get());
		System.out.println("Same value: " + ai.get());
		System.out.println("New value: " + ai.incrementAndGet());

	}
}
