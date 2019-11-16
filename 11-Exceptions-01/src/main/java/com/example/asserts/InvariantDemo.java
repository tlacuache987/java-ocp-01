/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.asserts;

/**
 *
 * @author anshenoy
 */
import java.util.Scanner;

public class InvariantDemo {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 20: ");
		int value = scanner.nextInt();

		// ?? add invariant

		System.out.printf("You have entered %d\n", value);
	}
}
