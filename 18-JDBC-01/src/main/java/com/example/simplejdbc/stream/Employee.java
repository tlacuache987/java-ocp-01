package com.example.simplejdbc.stream;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	// Just Analyze

	private int id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private double salary;

	private static transient NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
	private static transient DateFormat dateFormat = DateFormat.getDateInstance();

	@Override
	public String toString() {
		return "Employee   [ id = " + id + ",\n             firstName = " + firstName + ",\n             lastName = "
				+ lastName + ",\n             birthDate = " + dateFormat.format(birthDate) + ",\n             salary = "
				+ numberFormat.format(salary) + " ]";
	}

}
