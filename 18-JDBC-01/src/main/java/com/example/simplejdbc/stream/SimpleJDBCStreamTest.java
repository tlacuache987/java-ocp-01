package com.example.simplejdbc.stream;

import java.sql.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleJDBCStreamTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// Instance of EmployeeDAO class
		EmployeeDAO employeeDao = new EmployeeDAO(); // ??

		// Retrieve Employee Stream from Database.
		Stream<Employee> stream = employeeDao.getAllEmployeesAsStream(); // ??

		// Collect the results from Database into a List.
		List<Employee> employees = stream.collect(Collectors.toList()); // ??

		// Define a Supplier of Employee Stream
		Supplier<Stream<Employee>> streamSupplier = () -> employees.stream(); // ??

		System.out.println("== All employees ==");

		// List All employees using Stream Supplier object.
		streamSupplier.get().forEach(System.out::println);// ??

		System.out.println();
		
		System.out.println("Michael employees");

		// List All employees named "Michael" using Stream Supplier object.
		streamSupplier.get()
				.filter( e -> e.getFirstName().equals("Michael"))
				.forEach(System.out::println);// ??

		System.out.println();
		
		System.out.println("Employees born after 1970 && salary up to 100,000.00");

		// List All employees born after 1970-1-1 and having salary upper or equals than 100_000 using employees collection.
		// ??
		employees.stream()
			.filter(e -> e.getBirthDate().after(Date.valueOf("1970-1-1")))
			.filter(e -> e.getSalary() >= 100_000)
			.forEach(System.out::println);

		// Analyze
		double salaries = employees.stream()
			.filter(e -> e.getBirthDate().after(Date.valueOf("1970-1-1")))
			.filter(e -> e.getSalary() >= 100_000)
			.mapToDouble(Employee::getSalary)
			.sum();

		System.out.println();
		
		System.out.printf("Employees born after 1970 && salary up to 100,000.00 => sum: $%,.2f %n", salaries);

	}
}