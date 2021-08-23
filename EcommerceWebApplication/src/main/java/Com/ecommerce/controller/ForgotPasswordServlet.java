package Com.ecommerce.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.ecommerce.dbconnection.ConnectionProvider;

/**
 * Servlet implementation class ForgotPasswordServlet
 */
@WebServlet("/forgotpassword")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String question=request.getParameter("question");
		String answer=request.getParameter("answer");
		
		String newpassword=request.getParameter("newpassword");		
		
		
		
		int check=0;
		try {
			
			Connection con=ConnectionProvider.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from user123 where email ='"+email+"'and mobile='"+mobile+"'and question='"+question+"'and answer='"+answer+"'");
			
			while(rs.next()) {
				check=1;
				
				stmt.executeUpdate("update user123 set password='"+newpassword+"' where email='"+email+"'");
				response.sendRedirect("forgot-password.jsp?msg=done");
					
			}
			if(check==0) {
				response.sendRedirect("forgot-passowrd.jsp?msg=invalid");
			}
		
			
		
		}catch(Exception e){
			
			e.printStackTrace();
		//	response.sendRedirect("forgot-passowrd,jsp?msg=invalid");
		}
		
	}
	
}
