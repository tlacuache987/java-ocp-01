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
public class PersonClassInvariant {
	String name;
	String ssn;
	int age;

	private void checkAge() {
		// ?? add invariant
	}

	public void changeName(String fname) {
		checkAge();
		name = fname;
	}

	public static void main(String args[]) {

		PersonClassInvariant person1 = new PersonClassInvariant();
		person1.age = 15;
		person1.name = "dave";
		person1.changeName("David");
	}
}
