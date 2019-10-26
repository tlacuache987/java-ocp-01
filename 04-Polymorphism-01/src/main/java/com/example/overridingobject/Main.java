package com.example.overridingobject;

public class Main {

	public static void main(String args[]) {

		Employee emp1 = new Employee(121, "Ron", "ab123", 5000);

		System.out.println("employee details = " + emp1);

		// Employee emp2 = new Employee(122, "ken", "def123", 6000);

		Employee emp2 = new Employee(121, "Ron", "ab123", 5000);

		System.out.println("employee details = " + emp2);

		if (emp1.equals(emp2)) {
			System.out.println("employee objects are equal");

		} else {
			System.out.println("employee objects are  not equal");
		}
		
		if (emp1 == emp2) {
			System.out.println("employee references are the same");

		} else {
			System.out.println("employee references are not the same");
		}

	}
}
