package com.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class MovieUpdateJdbc {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/Moviess";
	        String user = "root";
	        String password = "B0806b@12";

	        try {
	            // Load JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish connection
	            Connection conn = DriverManager.getConnection(url, user, password);

	            // SQL query to update title 
	            String sql = "UPDATE Movie SET title = ?, rating = ? WHERE movie_id = ?";
	            PreparedStatement stmt = conn.prepareStatement(sql);

	            // Set values
	            stmt.setString(1, "The Matrix Reloaded");             // New title
	            stmt.setDouble(2, 8.5);                              // New rating
	            stmt.setInt(3, 2);                                     // movie_id to be updated

	            // Execute update
	            int rowsUpdated = stmt.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Movie updated successfully!");
	            } else {
	                System.out.println("No movie found with the given ID.");
	            }

	            // Close connection
	            stmt.close();
	            conn.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


