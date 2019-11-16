/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bytechannel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author tmcginn
 */
public class ByteChannelCopyTest {

	public static void main(String[] args) {
		
		args = new String[] { "ByteChannelCopyTest-watch.jpg", "ByteChannelCopyTest-watch-output.jpg" };

		if (args.length < 2) {
			System.out.println("Usage: ByteChannelCopyTest <original file> <copy>");
			System.exit(-1);

		}

		// Set FileInputStream with FileChannel and FileInputStream with FileOutputStream in try-catch-with-resources ??
		try (FileChannel inputChannel = new FileInputStream(args[0]).getChannel();
			 FileChannel outputChannel = new FileOutputStream(args[1]).getChannel()) {

			// read and write File ??
			System.out.println("File size: " + inputChannel.size());

			// Create a buffer to read into
			ByteBuffer buff = ByteBuffer.allocate((int) inputChannel.size());

			System.out.println("Bytes remaining: " + buff.remaining());
			System.out.println("Bytes read: " + inputChannel.read(buff));

			buff.position(0);

			System.out.println("Buffer: " + buff);
			System.out.println("Bytes remaining: " + buff.remaining());
			System.out.println("Wrote: " + outputChannel.write(buff) + "   bytes");
			

		} catch (FileNotFoundException f) {
			System.out.println("File not found: " + f);

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}

	}
}
