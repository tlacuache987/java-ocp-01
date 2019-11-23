package com.example.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {

	public static void main(String[] args) {

		String url = "jdbc:h2:tcp://localhost/data/EmployeeDB";
		String username = "sa";
		String password = "";

		String input = "";
		double searchValue;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try (Connection con = DriverManager.getConnection(url, username, password)) {

			String sql = "SELECT * FROM Employee WHERE Salary > ?";
			// Define a PreparedStatement to precompile sql statement.
			// ??

			// Loop
			while (true) { // This runs forever until user enters "q" or "Q"

				System.out.print("Enter salary to search for or Q to quit: ");

				input = in.readLine();
				if (input.equals("q") || input.equals("Q")) {
					break;
				}

				try {
					searchValue = Double.valueOf(input);

				} catch (NumberFormatException n) {
					System.out.println("Please enter a valid number.");
					continue;
				}

				// Sets entered value to PreparedStatement object.
				// ??

				// Execute PreparedStatement
				ResultSet rs = null; // ??

				while (rs.next()) {

					int empID = rs.getInt("ID");
					String first = rs.getString("FIRSTNAME");
					String last = rs.getString("LASTNAME");
					Date birth_date = rs.getDate("BIRTHDATE");
					float salary = rs.getFloat("SALARY");

					System.out.format("Employee ID:   %s%n" + "Employee Name: %s %s%n" + "Birth Date:    %s%n"
							+ "Salary:        %,.2f%n%n", empID, first, last, birth_date, salary);
				}
			} // end of while

		} catch (IOException | SQLException e) {

			System.out.println("SQLException: " + e);

		} // end of try-with-resources
	}
}