package com.example.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class Locks {

	public static int count = 0;

	public static void main(String[] args) throws InterruptedException {

		Lock lock = null; // ?? Define new ReentrantLock.

		List<String> numbers = new ArrayList<>();

		for (int i = 0; i < 3; i++) {

			new Thread(new Runnable() {

				@Override
				public void run() {

					// ?? lock

					for (int j = 0; j < 10; j++) {

						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						numbers.add(Thread.currentThread().getName() + " " + ++count);
					}

					// ?? unlock
				}

			}).start();
		}

		Thread.sleep(5000);

		System.out.println("printing numbers");

		numbers.forEach(System.out::println);

	}

}