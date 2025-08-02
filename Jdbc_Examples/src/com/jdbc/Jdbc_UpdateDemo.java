package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_UpdateDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    String url = "jdbc:mysql://localhost:3306/jdbc";
	    String userName = "root";
	    String password = "B0806b@12";
	     
	     Class.forName("com.mysql.cj.jdbc.Driver");
	      
	      Connection con = DriverManager.getConnection(url, userName, password);
	     
	      Statement st = con.createStatement();
	        // Update query
	      String updateQuery = "UPDATE students SET name = 'vidhya', email = 'vidhya@gmail.com' WHERE id = 103";
 
	      int rowsAffected = st.executeUpdate(updateQuery);

	       System.out.println(rowsAffected + " row(s) updated successfully!");

	        st.close();
	        con.close();
	    }
	}


