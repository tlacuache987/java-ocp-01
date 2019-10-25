/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;

public class ManagerTest {

	public static void main(String args[]) {
		
		Manager m = new Manager("Sistemas", 2, "Ivan", "abc-123", 100);
		
		System.out.println("manager id " + m.getEmpId() + ", name: " + m.getName() + ", earns: " + m.getSalary());

		m.raiseSalary(1250);
		m.changeName("Juan");
		
		System.out.println("manager id " + m.getEmpId() + ", name: " + m.getName() + ", earns: " + m.getSalary());
	}
}
