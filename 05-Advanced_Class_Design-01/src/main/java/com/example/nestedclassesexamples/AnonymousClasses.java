
package com.example.nestedclassesexamples;

public class AnonymousClasses {

	interface CompStringLength {

		public void computeLength(String str);
	}

	static CompStringLength strlength = null;

	public static void main(String args[]) {
		strlength.computeLength("helloworld");
		strlength.computeLength("java se 8 programming");
		strlength.computeLength("");
	}

}
