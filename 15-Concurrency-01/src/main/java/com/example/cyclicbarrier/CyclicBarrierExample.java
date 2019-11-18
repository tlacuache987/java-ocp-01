package com.example.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicBarrierExample implements Runnable {

	// Just Analyze

	final CyclicBarrier barrier = new CyclicBarrier(2);

	AtomicInteger threadCount = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {

		ExecutorService es = Executors.newFixedThreadPool(4);

		CyclicBarrierExample ex = new CyclicBarrierExample();

		es.submit(ex);

		Thread.sleep(5000);

		es.submit(ex);

		es.shutdown();
	}

	public void run() {

		try {
			System.out.println(Thread.currentThread().getName() + ". before await - " + threadCount.incrementAndGet());

			barrier.await();

			System.out.println(Thread.currentThread().getName() + ". after await - " + threadCount.get());

		} catch (BrokenBarrierException | InterruptedException ex) {

		}
	}

}