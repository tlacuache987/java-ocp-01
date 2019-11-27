package com.example.simplejdbc.stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;

public class EmployeeDAO {

	private String url = "jdbc:h2:tcp://localhost/data/EmployeeDB";
	private String username = "sa";
	private String password = "";

	private String query = "SELECT * FROM Employee";

	public Stream<Employee> getAllEmployeesAsStream() {

		// Define a Stream Builder of Employee objects
		Stream.Builder<Employee> streamBuilder = Stream.builder();// ??

		try (Connection con = DriverManager.getConnection(url, username, password);

				Statement stmt = con.createStatement();

				ResultSet rs = stmt.executeQuery(query)) {

			while (rs.next()) {

				Employee e = Employee.builder()
								.id(rs.getInt("ID"))
								.firstName(rs.getString("FirstName"))
								.lastName(rs.getString("LastName"))
								.birthDate(rs.getDate("BirthDate"))
								.salary(rs.getDouble("Salary"))
								.build();

				// Add the retrieved employee to the Stream Builder.
				streamBuilder.add(e); // ??

			} // end of while

		} catch (SQLException ex) {

			while (ex != null) {

				System.err.println("SQLState:  " + ex.getSQLState());
				System.err.println("Error Code:" + ex.getErrorCode());
				System.err.println("Message:   " + ex.getMessage());

				Throwable t = ex.getCause();

				while (t != null) {
					System.out.println("Cause:" + t);
					t = t.getCause();
				}
				ex = ex.getNextException();
			}
		}

		return streamBuilder.build(); // ?? Return a Stream of Employee, call build() method on the streamBuilder object.
	}
}