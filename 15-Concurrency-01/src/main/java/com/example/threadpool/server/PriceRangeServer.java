package com.example.threadpool.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class PriceRangeServer implements Runnable {

	private String price;
	private ServerSocket socketServer;

	// low inclusive
	double low = 20;

	// high exclusive
	double high = 200;

	public PriceRangeServer(int port) throws IOException {
		
		socketServer = new ServerSocket(port);
		socketServer.setSoTimeout(250);
		
		double d = Math.random() * (high - low) + low;
		price = String.format("%.2f", d);
	}

	public void accept() throws IOException {

		System.out.println("Accepting connections on port " + socketServer.getLocalPort());

		while (!Thread.interrupted()) {
			
			//System.out.println("waiting connection");

			try (Socket sock = socketServer.accept();
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()))) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException ex) {
					return;
				}

				bw.write(price);
			} catch (SocketTimeoutException ste) {
				// timeout every .25 seconds to see if interrupted
				// ste.printStackTrace(); // do nothing
			}
		}
		System.out.println("Done accepting");
	}

	@Override
	public void run() {
		try {
			accept();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}