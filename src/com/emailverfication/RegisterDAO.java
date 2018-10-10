package com.emailverfication;

import com.emailverfication.MySqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {

	public RegisterDAO() {
		
	}
	
	public String RegisterUser(RegisterBean rb) {
		
		String firstName = rb.getFirstName();
		String lastName = rb.getLastName();
		String email = rb.getEmail();
		String password = rb.getPassword();
		String myHash = rb.getMyHash();
		
		Connection conn = MySqlConnection.getConnection();
		
		try {
			
			String sqlQuery = "insert into user_details (First_Name,Last_Name,Email,Password,Hash) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setString(1, firstName);
			pst.setString(2, lastName);
			pst.setString(3, email);
			pst.setString(4, password);
			pst.setString(5, myHash);
			
			int i = pst.executeUpdate();
			
			if(i != 0) {				
				System.out.println("Succesfully created new user.");
				System.out.println("Sending Mail... ");
				
				SendingEmail se = new SendingEmail(email, myHash);
				se.sendMail();
				
				return "Success";
			}
			
		} catch (Exception e) {
			System.out.println("Error at RegisterDAO.java: " + e);
		}
		
		return "error";
	}
}
