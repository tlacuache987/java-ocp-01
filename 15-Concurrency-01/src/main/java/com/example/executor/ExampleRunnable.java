package com.example.executor;

public class ExampleRunnable /* implements runnable, invoke print() on run() method */ {

	private final String name;

	public ExampleRunnable(String name) {
		this.name = name;
	}

	public void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + ":" + i);
		}
	}
}
