package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_InsertDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
	    String userName = "root";
	    String password = "B0806b@12";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, userName, password);
 
	     Statement st = con.createStatement();
	                                              // Insert queries
	     String insertQuery1 = "INSERT INTO students (id,name, email) VALUES (105,'Bhagyashri', 'bhagyashri@gmail.com.com')";
	     String insertQuery2 = "INSERT INTO students (id,name, email) VALUES (109,'Shravani', 'Shravani12@gamil.com.com')";
	     String insertQuery3 = "INSERT INTO students (id, name, email) VALUES (106,'gita', 'gita@gmail.com')";
	     
	     st.executeUpdate(insertQuery1);                           // Execute insert queries
	     st.executeUpdate(insertQuery2);
	     st.executeUpdate(insertQuery3);
    
	     System.out.println("Data inserted successfully!");
	     st.close();
	     con.close();
	    }
	}


