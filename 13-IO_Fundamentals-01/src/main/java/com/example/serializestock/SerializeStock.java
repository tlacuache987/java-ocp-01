package com.example.serializestock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeStock {

	public static void main(String[] args) {

		// Determine if we have file name for the Portfolio
		if (args.length < 1) {
			System.out.println("Specify the name of a file name for the Portfolio");
			System.exit(-1);

		}

		// Create a stock portfolio
		Stock s1 = new Stock("ORCL", 100, 32.50);
		Stock s2 = new Stock("APPL", 100, 245);
		Stock s3 = new Stock("GOOG", 100, 54.67);
		Portfolio p = null;

		try {
			p = new Portfolio(s1, s2, s3);

		} catch (PortfolioException pe) {
			System.out.println("Exception creating Portfolio: " + pe);
			System.exit(-1);
		}

		System.out.println("Before serializaton:\n" + p + "\n");

		// Write out the Portfolio ??
		// Set FileOutputStream and ObjectOutputStream in try-catch-with-resources ??
		try {

			// Write (serialize) object ??

			System.out.println("Successfully wrote Portfolio as an object");

		} catch (IOException i) {
			System.out.println("Exception writing out Portfolio: " + i);
		}

		// Read the Portfolio back in
		// Set FileInputStream and ObjectInputStream in try-catch-with-resources ??
		try {

			// Read (deserialize) object ??

			System.out.println("Success: read Portfolio back in:\n" + null ); ??

		} catch (ClassNotFoundException | IOException i) {
			System.out.println("Exception reading in Portfolio: " + i);
		}
	}
}
