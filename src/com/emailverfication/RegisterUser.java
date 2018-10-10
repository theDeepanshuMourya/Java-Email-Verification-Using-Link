package com.emailverfication;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String firstName = request.getParameter("first_name");
			String lastName = request.getParameter("last_name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String newPassword = DigestUtils.md5Hex(password);
			
			// Generate Hash Code which helps in creating Activation Link
			Random theRandom = new Random();
			theRandom.nextInt(999999);
			String myHash = DigestUtils.md5Hex("" +	theRandom);
			
			// Create the data bean
			RegisterBean rb = new RegisterBean();
			rb.setFirstName(firstName);
			rb.setLastName(lastName);
			rb.setEmail(email);
			rb.setPassword(newPassword);
			rb.setMyHash(myHash);
			
			// Create the DAO file
			RegisterDAO regDAO = new RegisterDAO();
			String s1 = regDAO.RegisterUser(rb);
			
			if(s1.equals("Success")) {
				response.sendRedirect("verify.jsp");
			}else {
				response.sendRedirect("index.jsp");
			}
			
		} catch (Exception e) {
			System.out.println("Error at RegisterUser.java: " + e);
		}		
	}
}
