package com.example.arraylist;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArrayListTest implements Runnable {

	private List<String> wordList = null; // ?? Define a CopyOnWriteArrayList

	public static void main(String[] args) throws InterruptedException {

		ExecutorService es = null; // ?? Define a new cached thread pool

		ArrayListTest test = new ArrayListTest();

		// Submit 5 test instances in a for loop to ExecutorService
		// ??

		// await for thread termination 10 seconds
		// ??

		System.out.println("==ItemList==");
		test.getArrayList().stream().forEach(s -> System.out.println("Item: " + s));

		// shutdown Executor Service
		// ??
	}

	public void run() {

		try {
			Thread.sleep(new Random().nextInt(5) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		wordList.add("A set by " + Thread.currentThread().getName());
		wordList.add("B set by " + Thread.currentThread().getName());
		wordList.add("C set by " + Thread.currentThread().getName());
	}

	public List<String> getArrayList() {
		return wordList;
	}
}
