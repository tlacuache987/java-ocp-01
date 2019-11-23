package com.example.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorExample2 {

	public static void main(String[] args) {

		ExecutorService es = null; // ?? Define a 4 fixed thread pool

		// Execute two ExampleCallable instances, get the Future object for retrieve
		// response later.
		// ??
		// ??

		

		try {
			
			// ?? await 3 seconds for thread termination

			// ?? Shutdown Executor Service
			

			String result1 = null; // ?? gets future 1 result
			System.out.println("Result of one: " + result1);

			String result2 = null; // ?? gets future 1 result
			System.out.println("Result of two: " + result2);

		} catch (ExecutionException | InterruptedException ex) {
			System.out.println("Exception: " + ex);
		}

	}
}
