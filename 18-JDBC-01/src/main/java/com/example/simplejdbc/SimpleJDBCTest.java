package com.example.simplejdbc;

import java.sql.SQLException;
import java.util.Date;

public class SimpleJDBCTest {

	public static void main(String[] args) throws ClassNotFoundException {

		String url = "jdbc:h2:tcp://localhost/data/EmployeeDB";
		String username = "sa";
		String password = "";

		String query = "SELECT * FROM Employee";

		// Class.forName("org.h2.Driver"); // Not needed since JDBC 4

		// Get a Connection from DriverManager, create a Statement and execute query
		// within try-with-resources
		try { // ??

			// Iterate ResultSet to extract results
			while (true) { // ??

				int empID = -1; // ?? Get ID Column
				String first = null; // ?? Get FirstName Column
				String last = null; // ?? Get LastName Column
				Date birthDate = null; // ?? Get BirthDate Column
				float salary = -1; // ?? Get Salary Column

				System.out.println("Employee ID:   " + empID + "\n" + "Employee Name: " + first + " " + last + "\n"
						+ "Birth Date:    " + birthDate + "\n" + "Salary:        " + salary + "\n");
			} // end of while

		} catch (Exception ex1) { // ?? Catch SQL Exception, rename argument to ex

			while (ex1 != null) { // ?? rename variable to ex

				ex1.printStackTrace(); // ?? rename variable to ex

				SQLException ex = (SQLException) ex1; // ?? Delete this line
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("Error Code:" + ex.getErrorCode());
				System.out.println("Message:   " + ex.getMessage());

				Throwable t = ex.getCause();

				while (t != null) {
					System.out.println("Cause:" + t);
					t = t.getCause();
				}
				ex = ex.getNextException();
			}
		}
	}
}