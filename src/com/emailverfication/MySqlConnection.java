package com.emailverfication;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	static Connection conn;
	
	public static Connection getConnection() {

		try {
			
			System.out.println("Connecting... ");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// Database link, username and password
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/email_validation?useSSL=false", "root", "*****");
			System.out.println("Connection Succeeded");
			
		} catch (Exception e) {
			System.out.println(" Error at MySqlConnection.java: " + e);
		}
		
		return conn;
	}
	
}
