/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inmutableclasses;

import java.util.Date;

public final class BetterContact {

	private final String firstName;
	private final String lastName;
	private final Date dob;

	public BetterContact(String firstName, String lastName, Date dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		// this.dob = new Date(dob.getTime()); // Date ia mutable object, can be
		// modified by using Date.setXXX() hence to
		// prevent that
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "BetterContact [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

}