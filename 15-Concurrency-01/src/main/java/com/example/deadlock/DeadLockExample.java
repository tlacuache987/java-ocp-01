package com.example.deadlock;

public class DeadLockExample {

	// Just Analyze

	public static void main(String[] args) {

		Locks locks = new Locks();

		Worker1 worker1 = new Worker1(locks.lock1, locks.lock2);

		Worker2 worker2 = new Worker2(locks.lock1, locks.lock2);

		new Thread(worker1).start();
		new Thread(worker2).start();
	}
}

class Locks {
	public Object lock1 = new Object();
	public Object lock2 = new Object();
}

class Worker1 implements Runnable {

	private Object lock1;
	private Object lock2;

	public Worker1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		System.out.println("[worker1] starting worker 1");
		synchronized (lock1) {

			System.out.println("[worker1] got lock 1");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock2) {

				System.out.println("[worker1] got lock 2");

				System.out.println("[worker1] doing some computation");

			}

		}

	}

}

class Worker2 implements Runnable {

	private Object lock1;
	private Object lock2;

	public Worker2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		System.out.println("[worker2] starting worker 2");
		synchronized (lock2) {

			System.out.println("[worker2] got lock 2");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock1) {

				System.out.println("[worker2] got lock 1");

				System.out.println("[worker2] doing some computation");

			}

		}

	}

}