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
public class EmployeeDemo {

	public static void main(String args[]) {

		Employee e = new Employee();

		e.empId = 1;
		e.name = "Pepe";
		e.salary = 100;
		e.ssn = "ABC-123";
		
		System.out.println(
				"empoyee id "+ e.empId+", name: "+
				e.name + ", earns: " + e.salary);
		
		e.raiseSalary(50);
		e.changeName("Juan");
		
		System.out.println(
				"empoyee id "+ e.empId+", name: "+
				e.name + ", earns: " + e.salary);
	}
}
