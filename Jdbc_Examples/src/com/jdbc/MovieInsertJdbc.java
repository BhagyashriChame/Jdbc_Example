package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieInsertJdbc {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Moviess";
		String user = "root";
		String password = "B0806b@12";

		try {
			// Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO Movie (movie_id, title, genre, rating, status)VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);

			                                                      // Set values
			stmt.setInt(1, 2);
			stmt.setString(2, "The Matrix");
			stmt.setString(3, "Action");
			stmt.setDouble(4, 8.7);
			stmt.setString(5, "Available");

			                                                        // Execute insert
			int rowsInserted = stmt.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Movie inserted successfully!");
			}

			// Close connection
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
