package com.example.starvation;

public class StarvationExample {

	// Just Analyze

	public static void main(String[] args) {

		Worker worker = new Worker();

		for (int i = 0; i < 3; i++) {

			new Thread(new Runnable() {

				@Override
				public void run() {
					worker.work();
				}

			}).start();

			System.out.println("Thread " + i + " started.");
		}

	}
}

class Worker {

	public synchronized void work() {

		while (true) {

			System.out.println(Thread.currentThread().getName() + " is working");

			try {
				Thread.sleep(2000); // keep the lock
				// wait(2000); // release the lock
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}

	}

}