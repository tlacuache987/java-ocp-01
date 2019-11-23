package com.example.synchronized_;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

	private static AtomicInteger i = new AtomicInteger(0);

	public void increment() {
		i.incrementAndGet();
	}

	public void decrement() {
		i.decrementAndGet();
	}

	public int getValue() {
		return i.get();
	}
}
