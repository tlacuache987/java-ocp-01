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

		if (args.length < 2) {
			System.out.println("Usage: ByteChannelCopyTest <original file> <copy>");
			System.exit(-1);

		}

		// Set FileInputStream with FileChannel and FileInputStream with FileOutputStream in try-catch-with-resources ??
		try {

			// read and write File ??
			

		} catch (FileNotFoundException f) {
			System.out.println("File not found: " + f);

		} catch (IOException e) {
			System.out.println("IOException: " + e);

		}

	}
}
