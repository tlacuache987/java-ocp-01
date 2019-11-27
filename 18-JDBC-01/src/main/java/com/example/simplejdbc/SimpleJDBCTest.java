package com.example.simplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		try ( Connection con = DriverManager.getConnection(url, username, password);
			  Statement stmt = con.createStatement();
			  ResultSet rs = stmt.executeQuery(query) ) { // ??

			// Iterate ResultSet to extract results
			while (rs.next()) { // ??

				int empID = rs.getInt("ID"); // ?? Get ID Column
				String first = rs.getString("FirstName"); // ?? Get FirstName Column
				String last = rs.getString("LastName"); // ?? Get LastName Column
				Date birthDate = rs.getDate("BirthDate"); // ?? Get BirthDate Column
				float salary = rs.getFloat("Salary"); // ?? Get Salary Column

				System.out.println("Employee ID:   " + empID + "\n" + "Employee Name: " + first + " " + last + "\n"
						+ "Birth Date:    " + birthDate + "\n" + "Salary:        " + salary + "\n");
			} // end of while

		} catch (SQLException ex) { // ?? Catch SQL Exception, rename argument to ex

			while (ex != null) { // ?? rename variable to ex

				ex.printStackTrace(); // ?? rename variable to ex

				//SQLException ex = (SQLException) ex; // ?? Delete this line
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