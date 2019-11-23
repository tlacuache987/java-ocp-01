package com.example.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Latch {

	public static void main(String[] args) throws InterruptedException {

		// ?? Define a CountDownLatch

		NetworkService net = new NetworkService(null);
		net.start();

		DataBaseService db = new DataBaseService(null);
		db.start();

		ChatService chat = new ChatService(null);
		chat.start();

		// ?? latch await.

		Server server = new Server(net, db, chat);

		server.startup();
	}

}

class NetworkService extends Thread {

	private CountDownLatch latch;
	private boolean started = false;

	public NetworkService(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("[NetworkService] starting network service ....");

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("[NetworkService] starting " + (i + 1));
		}

		System.out.println("[NetworkService] network service started.");
		started = true;
		
		// ?? countDown latch
	}

	public boolean isStarted() {
		return started;
	}

}

class ChatService extends Thread {

	private CountDownLatch latch;
	private boolean started = false;

	public ChatService(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("[ChatService] starting chat service ....");

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("[ChatService] starting " + (i + 1));
		}

		System.out.println("[ChatService] chat service started.");
		started = true;
		
		// ?? countDown latch
	}

	public boolean isStarted() {
		return started;
	}

}

class DataBaseService extends Thread {

	private CountDownLatch latch;
	private boolean started = false;

	public DataBaseService(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("[DataBaseService] starting database service ....");

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("[DataBaseService] starting " + (i + 1));
		}

		System.out.println("[DataBaseService] database service started.");
		started = true;
		
		// ?? countDown latch
	}

	public boolean isStarted() {
		return started;
	}

}

class Server {

	private NetworkService net;
	private DataBaseService db;
	private ChatService chat;

	public Server(NetworkService net, DataBaseService db, ChatService chat) {
		this.net = net;
		this.db = db;
		this.chat = chat;
	}

	public void startup() throws InterruptedException {
		System.out.println("[Server] Starting main server....");
		
		Thread.sleep(200);
		System.out.println("[Server] checking services ...");
		
		Thread.sleep(200);
		System.out.println("[Server] Network service is "+ (net.isStarted() ? "started" : "down"));
		System.out.println("[Server] Database service is "+ (db.isStarted() ? "started" : "down"));
		System.out.println("[Server] Chat service is "+ (chat.isStarted() ? "started" : "down"));
	}

}