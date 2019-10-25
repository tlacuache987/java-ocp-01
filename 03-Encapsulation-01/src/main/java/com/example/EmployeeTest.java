/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class EmployeeTest {

	public static void main(String args[]) {

		Employee3 e = new Employee3(1, "Pepe", "ABC-123", 100);

		System.out.println("empoyee id " + e.getEmpId() + ", name: " + e.getName() + ", earns: " + e.getSalary());

		e.raiseSalary(50);
		e.changeName("Juan");

		System.out.println("empoyee id " + e.getEmpId() + ", name: " + e.getName() + ", earns: " + e.getSalary());
	}
}
