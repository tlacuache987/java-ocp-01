package com.example.final_;

public class MethodChildClass extends FinalMethodParentClass {

	// compile time error
	public void printMessage() {
		System.out.println("Cannot override method");
	}
}