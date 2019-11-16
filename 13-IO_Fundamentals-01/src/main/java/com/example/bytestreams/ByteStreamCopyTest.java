package com.example.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ByteStreamCopyTest {

	public static void main(String[] args) {
		
		args = new String[] { "ByteStreamCopyTest-spring.png", "ByteStreamCopyTest-spring-output.png" };

		if (args.length < 2) {
			System.out.println("Usage: ByteStreamCopyTest <original file> <copy>");
			System.exit(-1);

		}

		// Example use of InputStream methods
		// Set FileInputStream and FileOutputStream in try-catch-with-resources ??
		try (FileInputStream fis = new FileInputStream(args[0]);
			 FileOutputStream fos = new FileOutputStream(args[1])) {
			
			byte[] b = new byte[128];
			
			System.out.println("Bytes available: " + fis.available());

			// read and write File ??
			int count = 0;
			int read = 0;
			
			while((read = fis.read(b)) != -1) {
				fos.write(b);
				count += read;
			}
			
			System.out.println("Total bytes wrote: " + count);

		} catch (FileNotFoundException f) {
			System.out.println("File not found: " + f);

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}
	}
}
