package com.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class MovieDeleteJdbc {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/Moviess";
	        String user = "root";
	        String password = "B0806b@12";

	        try {
	            // Load JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Connect to database
	            Connection conn = DriverManager.getConnection(url, user, password);

	            // SQL to delete a movie by ID
	            String sql = "DELETE FROM Movie WHERE movie_id = ?";
	            PreparedStatement stmt = conn.prepareStatement(sql);

	            // Set the movie_id to delete (for example, delete movie with ID 2)
	            stmt.setInt(1, 2);

	            // Execute delete
	            int rowsDeleted = stmt.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Movie deleted successfully!");
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


