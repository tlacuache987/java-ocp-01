package com.example.executor;

import java.util.concurrent.Callable;

/**
 *
 * @author tmcginn
 */
public class ExampleCallable /* implements callable interface, compute sum() on call() method */ {

	private final String name;
	private final int len;
	private int sum = 0;

	public ExampleCallable(String name, int len) {
		this.name = name;
		this.len = len;
	}

	public String sum() {
		for (int i = 1; i <= len; i++) {
			System.out.println(name + ":" + i);
			sum += i;
		}
		return "sum: " + sum;
	}

}
