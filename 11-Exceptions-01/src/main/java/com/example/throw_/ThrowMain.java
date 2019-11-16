package com.example.throw_;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ThrowMain {

	public static void main(String[] args)  { // delete throws

		// ?? Surround with try catch
		try {
			
			int data = readByteFromFile("a.txt");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public static int readByteFromFile(String name) throws IOException  {
		// ?? Surround with try catch and re-throws catched-exception
		
		File f = new File(name);
		
		try (InputStream in = new FileInputStream(f)) {
		
			System.out.println("File open");
	
			if (f.length() > 250)
				throw new IOException("File too big");
	
			return in.read();
			
		} catch (IOException e) {
			// perform some logic
			// ... (log)
			
			e.printStackTrace();
			
			throw e;
		}

	}

}
