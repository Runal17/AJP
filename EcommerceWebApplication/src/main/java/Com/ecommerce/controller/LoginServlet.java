package Com.ecommerce.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

import Com.ecommerce.dbconnection.ConnectionProvider;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/signin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		
		HttpSession session=request.getSession();
		
		
	String email=	request.getParameter("email");
	String password=	request.getParameter("password");
		
		
	
	if(email.equals("ramchavan@gmail.com")&&password.equals("admin")) {
	
	
	session.setAttribute("email", email);
	
	response.sendRedirect("admin/admin-home.jsp");
	
	}else {
		int check=0;
		try {
			
			Connection con= ConnectionProvider.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from user123 where email='"+email+"'and password='"+password+"'");
			while(rs.next()) {
				
				check=1;
				session.setAttribute("email",email);
				response.sendRedirect("home.jsp");
				
			}
			if(check==0) {
			             response.sendRedirect("sign-in.jsp?msg=notexists");}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			response.sendRedirect("sign-in.jsp?msg=invalid");
		}
		
	  }
	
	 }
	
	}
