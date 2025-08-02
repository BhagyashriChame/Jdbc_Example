package com.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Jdbc_DeleteDemo {
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        
	        String url = "jdbc:mysql://localhost:3306/jdbc";
	        String userName = "root";
	        String password = "B0806b@12";

	                                                                // Load JDBC driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	      
	        Connection con = DriverManager.getConnection(url, userName, password);

	       
	        Statement st = con.createStatement();

	     
	        String deleteQuery = "DELETE FROM students WHERE name = 'Shri'";

	      
	        int rowsAffected = st.executeUpdate(deleteQuery);

	   
	        System.out.println(rowsAffected + " row(s) deleted successfully!");

	      
	        st.close();
	        con.close();
	    }
	}


