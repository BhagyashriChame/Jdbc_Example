package com.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Jdbc_demo {
	    public static void main(String args[]) throws ClassNotFoundException, SQLException {
	        String url = "jdbc:mysql://localhost:3306/jdbc";      
	        String userName = "root";
	        String pwd = "B0806b@12";
	        String query = "SELECT * FROM students";

	                                                                  // Load JDBC Driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	                                                                          // Connect to DB
	        Connection con = DriverManager.getConnection(url, userName, pwd);

	                                                                         // Create Statement
	        Statement st = con.createStatement();

	                                                                     // Execute query and store result
	        ResultSet rs = st.executeQuery(query);

	                           
	        System.out.println("ID\tName\t\tEmail");

	       
	        while (rs.next()) {
	            int id = rs.getInt("id");                              // Fetch by column name or index
	            String name = rs.getString("name");
	            String email = rs.getString("email");

	            System.out.println(id + "\t" + name + "\t" + email);
	        }

	        
	        rs.close();
	        st.close();
	        con.close();
	    }
	}


