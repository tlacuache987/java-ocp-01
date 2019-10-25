/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.immutableclassesexample;

interface CompStringLength {

	public void computeLength(String str);
}

public class AnonymousClassDemo {

	static CompStringLength strlength = null; // Define Anonymous Class

	public static void main(String args[]) {
		strlength.computeLength("hello world");
		strlength.computeLength("java se 8 programming");
		strlength.computeLength("");
	}

}
